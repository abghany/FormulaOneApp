package com.gnacoding.formulaoneapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gnacoding.formulaoneapp.domain.model.Driver

@Database(entities = [Driver::class], version = 1, exportSchema = false)
abstract class DriverDatabase : RoomDatabase() {
    abstract fun driverDao(): DriverDao
}