package com.example.testingsample

import org.junit.Assert.*
import org.junit.Test

class CountNumberTest{

    private val testCountNumber : CountNumber = CountNumber()

    @Test
    fun testSum(){
        val expected = 42
        assertEquals(expected, testCountNumber.sum(40,2))
    }

}