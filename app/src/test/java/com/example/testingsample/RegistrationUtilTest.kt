package com.example.testingsample

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class RegistrationUtilTest{

    lateinit var registrationUtil: RegistrationUtil

    @Before
    fun setup(){
        registrationUtil = RegistrationUtil()
    }
    @Test
    fun validUsernameAndCorrectlyPassword(){
        val result = registrationUtil.validateRegistrationInput(
            "Joko",
            "123",
            "123"
        )

        assertEquals("success", result, true)
    }

    @Test
    fun digitPasswordFalse(){
        val result = registrationUtil.validateRegistrationInput(
            "mamen",
            "1",
            "1"
        )

        assertEquals("failed, password less than 2 digits", result, false)

    }

    @Test
    fun usernameExist(){
        val result = registrationUtil.validateRegistrationInput(
            "budi",
            "123",
            "budi"
        )
        assertEquals("failed, username is exist", result, false)
    }

    @Test
    fun inputUsernameEmpty(){
        val result = registrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertEquals("username is empty", result, false)
    }

    @Test
    fun inputPasswordAndConfirmPasswordNotMatch(){
        val result = registrationUtil.validateRegistrationInput(
            "user",
            "1234",
            "123"
        )
        assertEquals("password not match", result, false)
    }

}