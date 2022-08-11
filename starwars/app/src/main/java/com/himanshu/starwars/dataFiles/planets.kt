package com.himanshu.starwars.dataFiles


data class Planets (
    val count: Long,
    val next: String,
    val previous: Any? = null,
    val results: List<Planet>
)

data class Planet (
    val name: String,
    val rotationPeriod: String,
    val orbitalPeriod: String,
    val diameter: String,
    val climate: String,
    val gravity: String,
    val terrain: String,
    val surfaceWater: String,
    val population: String,
    val residents: List<String>,
    val films: List<String>,
    val created: String,
    val edited: String,
    val url: String
)

