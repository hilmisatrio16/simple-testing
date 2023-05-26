package com.example.testingsample

class RegistrationUtil {

    private val existingUser = listOf(
        "sanjaya", "budi"
    )
    fun validateRegistrationInput(username : String,
    password : String, confirmPassword : String) : Boolean{

        if(username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()){
            return false
        }
        if(username in existingUser){
            return false
        }
        if(password != confirmPassword){
            return false
        }
        if(password.count { it.isDigit() } < 2){
            return false
        }

        return true
    }
}