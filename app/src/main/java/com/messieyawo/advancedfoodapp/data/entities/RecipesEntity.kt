package com.messieyawo.advancedfoodapp.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.messieyawo.advancedfoodapp.model.FoodRecipe
import com.messieyawo.advancedfoodapp.utils.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(var foodRecipe: FoodRecipe) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}
/**
 * auto generate equals to false because we do not want multiple food recipe fetched from server
 * we just want to replace the previous one with the recent fetched
 * **/