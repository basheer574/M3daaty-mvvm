package com.graps.m3daaty.model.network

import com.graps.m3daaty.model.domain.recipeInformation.RecipeInformation
import com.graps.m3daaty.model.domain.randomRecipes.RandomRecipes
import com.graps.m3daaty.model.domain.recipeNutrition.RecipeNutrition
import com.graps.m3daaty.model.domain.recipeSearch.RecipeSearch
import com.graps.m3daaty.model.domain.recipeTaste.RecipeTaste
import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface SpoonApiService {

    @GET("random")
    fun getRandomRecipes(
        @Query("tags") filterTag: String?,
        @Query("number") recipesCount: Int?,
        @Query("apiKey") apiKey: String?
    ) : Single<Response<RandomRecipes>>

    @GET("complexSearch")
    fun getRecipeSearchResult(
        @Query("query") recipeName:String?,
        @Query("apiKey") apiKey: String?
    ) : Single<Response<RecipeSearch>>

    @GET("{id}/information")
    fun getRecipeInfo(
        @Path("id") recipeId:Int,
        @Query("apiKey") apiKey: String?
    ) : Single<Response<RecipeInformation>>

    @GET("{id}/tasteWidget.json")
    fun getRecipeTaste(
        @Path("id") recipeId:Int,
        @Query("apiKey") apiKey: String?
    ) : Single<Response<RecipeTaste>>

    @GET("{id}/nutritionWidget.json")
    fun getRecipeNutrition(
        @Path("id") recipeId:Int,
        @Query("apiKey") apiKey: String?
    ) : Single<Response<RecipeNutrition>>
}