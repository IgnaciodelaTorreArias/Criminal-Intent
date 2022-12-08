package com.example.criminalintent.database

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Update
import androidx.room.Insert
import kotlinx.coroutines.flow.Flow
import java.util.UUID
@Dao
interface CrimeDAO {
    @Query("SELECT * FROM crime")
    fun getCrimes(): Flow<List<Crime>>

    @Query("SELECT * FROM crime WHERE id=(:id)")
    suspend fun getCrime(id: UUID): Crime

    @Update
    suspend fun updateCrime(crime: Crime)

    @Insert
    suspend fun addCrime(crime: Crime)
}