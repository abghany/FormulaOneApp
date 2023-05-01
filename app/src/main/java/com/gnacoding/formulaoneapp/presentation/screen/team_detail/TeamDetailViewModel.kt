package com.gnacoding.formulaoneapp.presentation.screen.team_detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gnacoding.formulaoneapp.domain.model.Team
import com.gnacoding.formulaoneapp.domain.repository.DriverRepository
import com.gnacoding.formulaoneapp.presentation.util.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TeamDetailViewModel @Inject constructor(
    private val repository: DriverRepository
) : ViewModel() {

    private val _team = MutableStateFlow<UiState<Team>>(UiState.Loading)
    val team: StateFlow<UiState<Team>>
        get() = _team

    fun getTeamById(teamId: Int) {
        viewModelScope.launch {
            _team.value = UiState.Loading
            _team.value = UiState.Success(repository.getTeamById(teamId))
        }
    }
}