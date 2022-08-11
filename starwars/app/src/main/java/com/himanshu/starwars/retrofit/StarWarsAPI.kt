package com.himanshu.starwars.retrofit

import com.himanshu.starwars.dataFiles.*
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface StarWarsAPI {
    @GET("people/")
    suspend fun getPeople(): Response<Profiles>

    @GET("films/")
    suspend fun getFilms(): Response<Films>

    @GET("planets/")
    suspend fun getPlanets(): Response<Planets>

    @GET
    suspend fun getPlanet(@Url url:String) : Response<Planet>

    @GET
    suspend fun getStarship(@Url url:String) : Response<Starship>

    @GET
    suspend fun getPeople(@Url url:String) : Response<Profile>
}