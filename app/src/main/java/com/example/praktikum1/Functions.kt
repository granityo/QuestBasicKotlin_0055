package com.example.praktikum1

fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello World!")
}
fun  withparameter (name: String){
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

fun withNamedArgument(name: String, age: Int){
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! you are $age years old")
}

fun withDefaultParameter(name: String = "Indra", age: Int) {
    println()
    println("== WithDefaultParameter ==")
    println("Hello, $name! you are $age years old")
}

fun withReturn(panjang : Int, lebar :Int) {
    return println(panjang * lebar)
}
fun main(){
    withoutParameter()
    withparameter("jhon")
    withNamedArgument(name = "jhon", age = 30)
    withDefaultParameter(age = 25)
}
