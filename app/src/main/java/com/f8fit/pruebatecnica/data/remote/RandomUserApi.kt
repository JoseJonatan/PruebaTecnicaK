package com.f8fit.pruebatecnica.data.remote

import com.f8fit.pruebatecnica.data.remote.response.ResponseDto
import retrofit2.http.GET

interface RandomUserApi {

    @GET("/api/")
    suspend fun getRandomUser(): ResponseDto
}