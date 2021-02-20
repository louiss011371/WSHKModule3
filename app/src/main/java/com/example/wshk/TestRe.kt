package com.example.wshk

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TestRe {
    private var apiClient: PetServices?=null
    fun loadResponse(presenter: PetPresenter) {
        apiClient = PetAPI.client.create(PetServices::class.java)
        val call = apiClient?.fetchAllPet()
        call?.enqueue(object : Callback<List<Pet>> {
            override fun onFailure(call: Call<List<Pet>>, t: Throwable) {

            }

            override fun onResponse(call: Call<List<Pet>>, response: Response<List<Pet>>) {

            }

        })
    }
}
