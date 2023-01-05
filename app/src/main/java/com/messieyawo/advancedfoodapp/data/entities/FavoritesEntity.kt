package com.messieyawo.advancedfoodapp.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.messieyawo.advancedfoodapp.model.Result
import com.messieyawo.advancedfoodapp.utils.Constants.Companion.FAVORITE_RECIPES_TABLE


@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity
    (
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)