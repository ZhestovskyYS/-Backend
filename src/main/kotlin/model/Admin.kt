package model

class Admin (
    name: String
): Person(name) {
    val income = ArrayList<Float>()
}