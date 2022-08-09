package com.himanshu.starwars

import retrofit2.Response
import retrofit2.http.GET

interface starWarsAPI {
    @GET("people/")
    suspend fun getPeople(): Response<Profiles>
}