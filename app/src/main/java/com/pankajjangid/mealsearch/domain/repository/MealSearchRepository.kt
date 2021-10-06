package com.pankajjangid.mealsearch.domain.repository

import com.pankajjangid.mealsearch.data.model.MealsDTO

interface MealSearchRepository {

    suspend fun getMealSearch(s:String): MealsDTO



}