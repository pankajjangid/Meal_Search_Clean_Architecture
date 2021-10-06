package com.pankajjangid.mealsearch.data.repository

import com.pankajjangid.mealsearch.data.model.MealsDTO
import com.pankajjangid.mealsearch.data.remote.MealSearchAPI
import com.pankajjangid.mealsearch.domain.repository.MealSearchRepository

class MealSearchRepistoryImpl(private val mealSearchAPI: MealSearchAPI) : MealSearchRepository {

    override suspend fun getMealSearch(s: String): MealsDTO {
        return mealSearchAPI.getSearchMealList(s)
    }
}