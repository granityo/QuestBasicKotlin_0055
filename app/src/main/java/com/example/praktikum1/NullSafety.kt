package com.example.praktikum1

fun nullSafety(){
    var neverNull: String = "This can't be null"

    var nullable: String? = "You can keep a Null here"

    nullable = null

    if(neverNull == null){
        println("inferredNonNull is Null")
    } else {
        println("inferredNonNull is not Null")
    }

    println(neverNull. length)
    println(nullable?.length)

    fun strLeghth(notNull: String): Int{
        return notNull.length
    }

    println(strLeghth(neverNull))

}

fun main(){
    nullSafety()
}