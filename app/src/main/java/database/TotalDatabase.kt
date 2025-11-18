package com.example.lab_week_10.database

import androidx.room.Database
import androidx.room.RoomDatabase

// Create a database with the @Database annotation
@Database(
    entities = [Total::class], // HANYA berisi kelas Entity
    version = 1
)
abstract class TotalDatabase : RoomDatabase() {

    // Fungsi ini menyediakan akses ke DAO
    abstract fun totalDao(): TotalDao
}