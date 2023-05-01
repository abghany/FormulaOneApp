package com.gnacoding.formulaoneapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "driver")
data class Driver(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String,
    val raceNumber: String,
    val nationality: Int,
    val profilePicture: Int,
    val teamConstructor: String,
    val totalPodium: String,
    val totalPoints: String,
    val totalWorldChampionship: String,
    val biography: String,
    val isFavorite: Boolean = false
)
