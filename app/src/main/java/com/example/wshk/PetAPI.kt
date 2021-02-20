package com.example.wshk

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface PetAPI {
    companion object {
        private var retrofit: Retrofit? = null
        val client: Retrofit
            get() {
                if (retrofit == null) {
                    retrofit = Retrofit.Builder()
                            .addConverterFactory(GsonConverterFactory.create())
                            .baseUrl("https://wshk1920.herokuapp.com/api")
                            .build()
                }
                return retrofit!!
            }
    }
}