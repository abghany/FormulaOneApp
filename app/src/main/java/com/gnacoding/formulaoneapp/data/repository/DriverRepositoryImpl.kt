package com.gnacoding.formulaoneapp.data.repository

import com.gnacoding.formulaoneapp.data.data_source.TeamDataSource
import com.gnacoding.formulaoneapp.data.local.DriverDao
import com.gnacoding.formulaoneapp.domain.model.Driver
import com.gnacoding.formulaoneapp.domain.model.Team
import com.gnacoding.formulaoneapp.domain.repository.DriverRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class DriverRepositoryImpl @Inject constructor(
    private val driverDao: DriverDao,
) : DriverRepository {

    private val teams = mutableListOf<Team>()

    init {
        if (teams.isEmpty()) {
            TeamDataSource.dummyTeams.forEach { team ->
                teams.add(
                    Team(
                        id = team.id,
                        teamCar = team.teamCar,
                        teamLogo = team.teamLogo,
                        name = team.name,
                        fullTeamName = team.fullTeamName,
                        base = team.base,
                        teamChief = team.teamChief,
                        chassis = team.chassis,
                        powerUnit = team.powerUnit,
                        totalWorldChampionship = team.totalWorldChampionship,
                        inProfile = team.inProfile
                    )
                )
            }
        }
    }

    override fun getAllDrivers(): Flow<List<Driver>> = driverDao.getAllDrivers()

    override fun getAllFavoriteDrivers(): Flow<List<Driver>> = driverDao.getAllFavoriteDrivers()

    override fun getDriver(id: Int): Flow<Driver> = driverDao.getDriver(id)

    override fun searchDriver(query: String): Flow<List<Driver>> = driverDao.searchDriver(query)

    override suspend fun insertAllDriver(driverList: List<Driver>) =
        driverDao.insertAllDriver(driverList)

    override suspend fun updateFavoriteDriver(id: Int, isFavorite: Boolean) =
        driverDao.updateFavoriteDriver(id, isFavorite)

    override fun getAllTeams(): Flow<List<Team>> {
        return flowOf(teams)
    }

    override fun getTeamById(teamId: Int): Team {
        return teams.first { team ->
            team.id == teamId
        }
    }
}