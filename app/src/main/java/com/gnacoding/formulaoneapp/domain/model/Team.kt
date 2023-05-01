package com.gnacoding.formulaoneapp.domain.model

data class Team(
    val id: Int,
    val teamCar: Int,
    val teamLogo: Int,
    val name: String,
    val fullTeamName: String,
    val base: String,
    val teamChief: String,
    val chassis: String,
    val powerUnit: String,
    val totalWorldChampionship: String,
    val inProfile: String
)
