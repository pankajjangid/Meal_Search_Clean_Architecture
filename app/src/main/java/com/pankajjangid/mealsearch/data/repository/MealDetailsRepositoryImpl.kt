package com.pankajjangid.mealsearch.data.repository

import com.pankajjangid.mealsearch.data.model.MealsDTO
import com.pankajjangid.mealsearch.data.remote.MealSearchAPI
import com.pankajjangid.mealsearch.domain.repository.MealDetailsRepository

class MealDetailsRepositoryImpl(private val mealSearchAPI: MealSearchAPI) : MealDetailsRepository {

    override suspend fun getMealDetails(id: String): MealsDTO {
        return mealSearchAPI.getMealDetails(id)
    }
}