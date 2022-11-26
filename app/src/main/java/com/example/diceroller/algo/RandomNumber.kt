package com.example.diceroller.algo

class Dice (private val sides: Int ){
    fun rollIt () : Int{
        return (1..sides).random()
    }
}