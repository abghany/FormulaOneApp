package com.gnacoding.formulaoneapp.di

import android.app.Application
import androidx.room.Room
import com.gnacoding.formulaoneapp.data.local.DriverDao
import com.gnacoding.formulaoneapp.data.local.DriverDatabase
import com.gnacoding.formulaoneapp.data.repository.DriverRepositoryImpl
import com.gnacoding.formulaoneapp.domain.repository.DriverRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application) = Room
        .databaseBuilder(app, DriverDatabase::class.java, "driver.db")
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    fun provideDriverDao(driverDb: DriverDatabase) = driverDb.driverDao()

    @Provides
    @Singleton
    fun provideDriverRepository(driverDao: DriverDao): DriverRepository {
        return DriverRepositoryImpl(driverDao)
    }
}