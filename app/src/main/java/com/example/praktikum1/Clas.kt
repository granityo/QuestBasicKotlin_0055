package com.example.praktikum1

class  Motor()

class  Contact(val id: Int, var email : String)

fun main (){
    val Contact = Contact(1, "mary@gmail.com")

    // Prints the value of the property: email
    println(Contact.email)

    // Prints the value of the property: email
    Contact.email = "jane@mail.com"

    // Prints the value of the property: email
    println(Contact.email)

}

