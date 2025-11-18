package com.example.lab_week_10

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TotalViewModel : ViewModel() {

    // Gunakan MutableLiveData agar nilainya bisa diubah dari dalam ViewModel
    private val _total = MutableLiveData<Int>(0)

    // Ekspos sebagai LiveData yang tidak bisa diubah dari luar
    val total: LiveData<Int>
        get() = _total

    fun incrementTotal() {
        _total.value = (_total.value ?: 0) + 1
    }

    fun setTotal(value: Int) {
        _total.value = value
    }
}
