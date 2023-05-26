package com.example.testingsample

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class MyObjectTest {

    lateinit var myObject: MyObject

    @Before
    fun setup(){
        myObject = MyObject()
    }
    @Test
    fun addNumbersTest() {
        val a = 2
        val b = 2

        assertEquals(4, myObject.addNumbers(a,b))
    }

    @Test
    fun multiplyNumbersTest() {
        val a = 3
        val b = 3

        assertEquals(9, myObject.multiplyNumbers(a,b))
    }
}