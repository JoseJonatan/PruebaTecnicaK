package com.f8fit.pruebatecnica.data.remote

import com.f8fit.pruebatecnica.data.mappers.toDomain
import com.f8fit.pruebatecnica.domain.model.RandomUser
import com.f8fit.pruebatecnica.domain.repository.RandomUserRepository
import com.f8fit.pruebatecnica.domain.util.Resource
import javax.inject.Inject

class RandomUserRepositoryImpl @Inject constructor(
    private val randomUserApi: RandomUserApi
    ): RandomUserRepository {

    override suspend fun fetchRandomUser(): Resource<RandomUser> {
        return try {
            Resource.Success(
                data = randomUserApi.getRandomUser().results.first().toDomain()
            )
        } catch (e: Exception) {
            Resource.Error(
                message = "Unknown error"
            )
        }
    }
}