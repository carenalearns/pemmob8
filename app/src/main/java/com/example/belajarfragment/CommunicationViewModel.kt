package com.example.belajarfragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    private val mName1 = MutableLiveData<String>()
    val fname: LiveData<String>
        get() = mName1

    fun setName(fname: String) {
        mName1.value = fname
    }
    private val mName2 = MutableLiveData<String>()
    val lname: LiveData<String>
        get() = mName2

    fun setName2(lname: String) {
        mName2.value = lname
    }
    private val mName3 = MutableLiveData<String>()
    val nomor: LiveData<String>
        get() = mName3

    fun setName3(nomor: String) {
        mName3.value = nomor
    }
}