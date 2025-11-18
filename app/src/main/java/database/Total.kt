// File: database/Total.kt

package com.example.lab_week_10.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "total_table") // Penanda bahwa ini adalah tabel
data class Total(
    @PrimaryKey val id: Long,
    val total: Int
)
