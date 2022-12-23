package com.example.calculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

//androidx.lifecycle.ViewModel allows to keep the state alive contrary to android activities
class CalculatorViewModel: ViewModel(){

    var state by mutableStateOf(CalculatorState())
        private set

    fun onAction(action: CalculatorAction){
        
    }

}