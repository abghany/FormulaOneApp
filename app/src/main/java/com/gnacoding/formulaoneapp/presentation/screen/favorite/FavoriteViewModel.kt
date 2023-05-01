package com.gnacoding.formulaoneapp.presentation.screen.favorite

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
class FavoriteViewModel @Inject constructor(
    private val repository: DriverRepository,
) : ViewModel() {

    private val _allFavoriteDrivers = MutableStateFlow<UiState<List<Driver>>>(UiState.Loading)
    val allFavoriteDrivers = _allFavoriteDrivers.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getAllFavoriteDrivers()
                .catch {
                    _allFavoriteDrivers.value = UiState.Error(errorMessage = it.message.toString())
                }
                .collect { _allFavoriteDrivers.value = UiState.Success(data = it) }
        }
    }
}