package com.gnacoding.formulaoneapp.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.gnacoding.formulaoneapp.domain.model.Driver
import kotlinx.coroutines.flow.Flow

@Dao
interface DriverDao {
    @Query("SELECT * FROM driver")
    fun getAllDrivers(): Flow<List<Driver>>

    @Query("SELECT * FROM driver WHERE isFavorite = 1")
    fun getAllFavoriteDrivers(): Flow<List<Driver>>

    @Query("SELECT * FROM driver WHERE id = :id")
    fun getDriver(id: Int): Flow<Driver>

    @Query("SELECT * FROM driver WHERE name LIKE '%' || :query || '%'")
    fun searchDriver(query: String): Flow<List<Driver>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllDriver(driverList: List<Driver>)

    @Query("UPDATE driver SET isFavorite = :isFavorite WHERE id = :id")
    suspend fun updateFavoriteDriver(id: Int, isFavorite: Boolean)
}