package com.pankajjangid.mealsearch.presentation.meal_search

import com.pankajjangid.mealsearch.domain.model.Meal

data class MealSearchState(
    val isLoading: Boolean = false,
    val data: List<Meal>? = null,
    val error: String = ""
)