package com.f8fit.pruebatecnica.data.mappers

import com.f8fit.pruebatecnica.data.remote.response.Result
import com.f8fit.pruebatecnica.domain.model.RandomUser

fun Result.toDomain(): RandomUser{
    return RandomUser(
        name = "${this.name.first} ${this.name.last}",
        email = this.email,
        birthday = this.dob.date,
        age = this.dob.age,
        address = "${this.location.state} ${this.location.city}",
        phone = this.phone,
        password = this.login.password,
        photo = this.picture.large
    )
}