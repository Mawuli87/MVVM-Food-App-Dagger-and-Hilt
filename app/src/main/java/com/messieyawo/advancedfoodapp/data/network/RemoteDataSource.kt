package com.messieyawo.advancedfoodapp.data.network

import androidx.lifecycle.viewModelScope
import com.messieyawo.advancedfoodapp.model.FoodRecipe
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {
    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }

    suspend fun searchRecipes(searchQuery: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.searchRecipes(searchQuery)
    }


}