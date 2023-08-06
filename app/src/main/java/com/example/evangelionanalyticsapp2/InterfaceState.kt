package com.example.evangelionanalyticsapp2

class InterfaceState {
    var state = 0
    fun InterfaceState() {
        state = 0
    }
    fun getState(): Int {
        return state
    }
    fun setState(s: Int) {
        state = s
    }


}