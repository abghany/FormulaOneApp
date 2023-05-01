package com.gnacoding.formulaoneapp.presentation.screen.teams

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gnacoding.formulaoneapp.domain.model.Team
import com.gnacoding.formulaoneapp.domain.repository.DriverRepository
import com.gnacoding.formulaoneapp.presentation.util.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TeamsViewModel @Inject constructor(
    private val repository: DriverRepository,
) : ViewModel() {

    private val _allTeams = MutableStateFlow<UiState<List<Team>>>(UiState.Loading)
    val allTeams: StateFlow<UiState<List<Team>>>
        get() = _allTeams

    fun getAllTeams() {
        viewModelScope.launch {
            repository.getAllTeams()
                .catch { _allTeams.value = UiState.Error(errorMessage = it.message.toString()) }
                .collect { _allTeams.value = UiState.Success(data = it) }
        }
    }
}