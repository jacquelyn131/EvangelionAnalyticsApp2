package com.example.evangelionanalyticsapp2

class InterfaceState {
    var state = 0
    constructor() {
        state = 0
    }
    fun getter(): Int {
        return state
    }
    fun setter(s: Int) {
        state = s
    }



}