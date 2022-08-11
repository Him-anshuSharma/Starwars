package com.himanshu.starwars.retrofit

import com.himanshu.starwars.dataFiles.Films
import com.himanshu.starwars.dataFiles.Planets
import com.himanshu.starwars.dataFiles.Profiles
import retrofit2.Response
import retrofit2.http.GET

interface StarWarsAPI {
    @GET("people/")
    suspend fun getPeople(): Response<Profiles>

    @GET("films/")
    suspend fun getFilms(): Response<Films>

    @GET("planets/")
    suspend fun getPlanets(): Response<Planets>
}