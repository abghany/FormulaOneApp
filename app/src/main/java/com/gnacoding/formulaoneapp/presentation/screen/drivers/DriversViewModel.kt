package com.gnacoding.formulaoneapp.presentation.screen.drivers

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gnacoding.formulaoneapp.data.data_source.DriverDataSource
import com.gnacoding.formulaoneapp.domain.model.Driver
import com.gnacoding.formulaoneapp.domain.repository.DriverRepository
import com.gnacoding.formulaoneapp.presentation.util.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DriversViewModel @Inject constructor(
    private val repository: DriverRepository
) : ViewModel() {

    private val _allDrivers = MutableStateFlow<UiState<List<Driver>>>(UiState.Loading)
    val allDrivers = _allDrivers.asStateFlow()

    private val _driverState = mutableStateOf(DriverState())
    val driverState: State<DriverState> = _driverState

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getAllDrivers().collect { driver ->
                when (driver.isEmpty()) {
                    true -> repository.insertAllDriver(DriverDataSource.dummyDrivers)
                    else -> _allDrivers.value = UiState.Success(driver)
                }
            }
        }
    }

    private fun searchDriver(query: String) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.searchDriver(query)
                .catch { _allDrivers.value = UiState.Error(errorMessage = it.message.toString()) }
                .collect { _allDrivers.value = UiState.Success(data = it) }
        }
    }

    fun onQueryChange(query: String) {
        _driverState.value = _driverState.value.copy(query = query)
        searchDriver(query)
    }
}