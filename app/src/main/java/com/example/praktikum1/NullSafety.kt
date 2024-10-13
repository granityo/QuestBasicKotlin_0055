package com.example.praktikum1

fun nullSafety() {
    var neverNull: String = "This can't be null"

    var nullable: String? = "You can keep a Null here"

    nullable = null

    if (neverNull == null) {
        println("inferredNonNull is Null")
    } else {
        println("inferredNonNull is not Null")
    }
}