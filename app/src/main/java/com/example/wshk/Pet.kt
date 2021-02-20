package com.example.wshk

import com.google.gson.annotations.SerializedName
data class Pet (
        val data: Data
)

data class Data(
        @SerializedName("bread")
        val bread: String
)


