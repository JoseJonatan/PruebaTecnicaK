package com.f8fit.pruebatecnica.data.remote.response

data class Info(
    val page: Int,
    val results: Int,
    val seed: String,
    val version: String
)