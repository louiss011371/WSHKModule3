package com.example.wshk

class PetPresenter(val petView: PetContact.view, val repository: PetDataRepo) : PetContact.presenter {
    private val view : PetContact.view = petView;
    override fun networkCall() {
        repository.loadResponse(this)

    }

    override fun onPetResultSuccess(result: List<Pet>?) {
//        TODO("Not yet implemented")
    }

    override fun onPetResultFailure(error: Throwable) {
//        TODO("Not yet implemented")
    }
}