package com.f8fit.pruebatecnica.domain.repository

import com.f8fit.pruebatecnica.domain.model.RandomUser
import com.f8fit.pruebatecnica.domain.util.Resource

interface RandomUserRepository {

    suspend fun fetchRandomUser(): Resource<RandomUser>
}