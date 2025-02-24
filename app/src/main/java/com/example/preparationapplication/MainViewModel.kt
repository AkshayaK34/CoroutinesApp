package com.example.preparationapplication

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel : ViewModel() {
    init {

        //inside of the sus function to return the value
//        viewModelScope.launch {
//            var result = viewModelScope.async {
//                delay(5000L)
//                Log.d("Coroutines", "1 Running")
//                true
//            }.await()
//            Log.d("Coroutines", result.toString())
//            Log.d("Coroutines", "2 Running")
//        }

        //getting value outside
            var result = viewModelScope.async {
                delay(5000L)
                Log.d("Coroutines", "1 Running")
                true
            }
            result.invokeOnCompletion {
                Log.d("Coroutines", result.getCompleted().toString())
            }
            Log.d("Coroutines", "2 Running")

    }
}