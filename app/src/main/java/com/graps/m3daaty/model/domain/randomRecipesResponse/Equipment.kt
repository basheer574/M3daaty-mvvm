package com.graps.m3daaty.model.domain.randomRecipesResponse


import com.google.gson.annotations.SerializedName

data class Equipment(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("image")
    val image: String? = null,
    @SerializedName("localizedName")
    val localizedName: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("temperature")
    val temperature: Temperature? = null
)