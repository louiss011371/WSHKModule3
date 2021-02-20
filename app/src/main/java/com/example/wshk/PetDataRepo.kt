package com.example.wshk

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PetDataRepo: PetContact.model {
    private var apiClient: PetServices?=null
    override fun loadResponse(petPresenter: PetPresenter) {
        apiClient = PetAPI.client.create(PetServices::class.java)
        val call = apiClient?.fetchAllPet()
        call?.enqueue(object : Callback<List<Pet>> {
            override fun onFailure(call: Call<List<Pet>>, t: Throwable) {
//                petPresenter.petView.getPetResultFailure(t)
                println("t = ${t}")
            }

            override fun onResponse(call: Call<List<Pet>>, response: Response<List<Pet>>) {
                val lists = response.body()
//                petPresenter.petView.getPetResultSuccess(lists)
                println("lists = ${lists}")
            }
        })
        }
    }
