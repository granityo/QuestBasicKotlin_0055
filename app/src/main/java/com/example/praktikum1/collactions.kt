package com.example.praktikum1

fun ContohList(){
    println("== List ==")

    //List Read-Only
    val readOnlyAbjad = listOf("A","B","C")
    println(readOnlyAbjad)

    //List Mutable
    val shape: MutableList<String> = mutableListOf("Circle","Square","Triangle")
    println(shape)

    //menambahkan data ke dalam list mutable
    shape.add("Circle")
    println(shape)

    //menghapus data dari list mutable
    shape.remove("Triangle")
    println(shape)

    println(shape.first())
    println(shape.last())
    println(shape.count())

    shape.removeAt(1)
    println(shape)

    //mengunggah dari dalam list mutable
    shape[0] = "Oval"
    println(shape)

    //list read-Only
    val shapeLocked: List<String> = shape
    println(shapeLocked)

}

fun  ContohSet(){
    println()
    println("=== Set ===")

    // Set read-only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    val shape: MutableSet<String> = mutableSetOf("Circle","Square","Triangle")
    println(shape)

    //menambahkan data ke dalam set mutable
    shape.add("Rectangle")

    //menghapus data dari set mutable
    shape.remove("Circle")
    println(shape)

    //set read-only
    val shapeLocked: Set<String> = shape
    println(shapeLocked)
}

fun ContohMap(){

    println()
    println("=== Map ===")
    //map read-only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to  3)
    println(readOnlyShape)

    //map mutable
    val shape: MutableMap<String,Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to  3)
    println(shape)

    //menambahlan data ke dalam map mutable
    shape["Rectangle"] = 4
    println(shape)

    //menghapus data dari map mutable
    shape.remove("Circle")
    println(shape)

    //mengubah data dalam map mutable
    shape["Square"] = 5
    println(shape)

    // map read-only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)

    fun main(){
        ContohList()
        ContohSet()
        ContohMap()
    }


}

