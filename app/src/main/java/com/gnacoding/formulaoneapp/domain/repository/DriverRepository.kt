package com.gnacoding.formulaoneapp.domain.repository

import com.gnacoding.formulaoneapp.domain.model.Driver
import com.gnacoding.formulaoneapp.domain.model.Team
import kotlinx.coroutines.flow.Flow

interface DriverRepository {

    fun getAllDrivers(): Flow<List<Driver>>

    fun getAllFavoriteDrivers(): Flow<List<Driver>>

    fun getDriver(id: Int): Flow<Driver>

    fun searchDriver(query: String): Flow<List<Driver>>

    suspend fun insertAllDriver(driverList: List<Driver>)

    suspend fun updateFavoriteDriver(id: Int, isFavorite: Boolean)

    fun getAllTeams(): Flow<List<Team>>

    fun getTeamById(teamId: Int): Team
}