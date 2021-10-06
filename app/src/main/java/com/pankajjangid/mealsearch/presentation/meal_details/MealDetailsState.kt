package com.pankajjangid.mealsearch.presentation.meal_details

import com.pankajjangid.mealsearch.domain.model.MealDetails

data class MealDetailsState(
    val isLoading: Boolean = false,
    val data: MealDetails? = null,
    val error: String = ""
) {
}