package com.example.criminalintent

import android.annotation.SuppressLint
import android.view.View
import android.view.View.OnClickListener
import androidx.recyclerview.widget.RecyclerView
import com.example.criminalintent.database.Crime
import com.example.criminalintent.databinding.ListItemCrimeBinding
import java.util.UUID

class CrimeHolder(private val binding: ListItemCrimeBinding) : RecyclerView.ViewHolder(binding.root) {
    @SuppressLint("ResourceAsColor")
    fun bindCrime(crime: Crime, onCrimeClicked: (crimeId: UUID)->Unit){
        binding.apply {
            root.setOnClickListener{
                onCrimeClicked(crime.id)
            }
            crimeTitle.text = crime.title
            crimeDate.text = crime.date.toString()
            handcuffImage.visibility = if (crime.isSolved) View.VISIBLE else View.GONE
        }

    }
}
