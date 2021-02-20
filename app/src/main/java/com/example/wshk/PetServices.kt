package com.example.wshk

import retrofit2.Call
import retrofit2.http.GET

interface PetServices {
    @GET("/pet")
    fun fetchAllPet(): Call<List<Pet>>
}