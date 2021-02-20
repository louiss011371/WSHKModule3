package com.example.wshk

interface PetContact {

    interface model{
        fun loadResponse(presenter: PetPresenter)
    }

    interface view{
        fun getPetResultSuccess(lists: List<Pet>?)
        fun getPetResultFailure(error: Throwable)
    }
    interface presenter {
        fun networkCall()
        fun onPetResultSuccess(result: List<Pet>?)
        fun onPetResultFailure(error: Throwable)
    }
}