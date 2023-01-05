package com.messieyawo.advancedfoodapp.model


import com.google.gson.annotations.SerializedName

data class FoodRecipe(
    @SerializedName("number")
    val number: Int,
    @SerializedName("results")
    val results: List<Result>,
    @SerializedName("totalResults")
    val totalResults: Int
)