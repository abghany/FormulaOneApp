package com.gnacoding.formulaoneapp.presentation.screen.driver_detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
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
class DriverDetailViewModel @Inject constructor(
    private val repository: DriverRepository
) : ViewModel() {

    private val _driver = MutableStateFlow<UiState<Driver>>(UiState.Loading)
    val driver = _driver.asStateFlow()

    fun getDriver(id: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getDriver(id)
                .catch { _driver.value = UiState.Error(errorMessage = it.message.toString()) }
                .collect { _driver.value = UiState.Success(data = it) }
        }
    }

    fun updateFavoriteDriver(id: Int, isFavorite: Boolean) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateFavoriteDriver(id, isFavorite)
        }
    }
}