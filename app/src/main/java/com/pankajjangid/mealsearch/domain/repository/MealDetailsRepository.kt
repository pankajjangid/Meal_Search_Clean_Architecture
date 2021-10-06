package com.pankajjangid.mealsearch.domain.repository

import com.pankajjangid.mealsearch.data.model.MealsDTO

interface MealDetailsRepository {

    suspend fun getMealDetails(id:String):MealsDTO

}