package com.pankajjangid.mealsearch.hilt

import com.pankajjangid.mealsearch.common.Constants
import com.pankajjangid.mealsearch.data.remote.MealSearchAPI
import com.pankajjangid.mealsearch.data.repository.MealDetailsRepositoryImpl
import com.pankajjangid.mealsearch.data.repository.MealSearchRepistoryImpl
import com.pankajjangid.mealsearch.domain.repository.MealDetailsRepository
import com.pankajjangid.mealsearch.domain.repository.MealSearchRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object HIltModules {


    @Provides
    @Singleton
    fun provideMealSearchAPI(): MealSearchAPI {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(MealSearchAPI::class.java)
    }


    @Provides
    fun provideMealSearchRepository(mealSearchAPI: MealSearchAPI): MealSearchRepository {
        return MealSearchRepistoryImpl(mealSearchAPI)
    }


    @Provides
    fun provideMealDetails(searchMealSearchAPI: MealSearchAPI): MealDetailsRepository {
        return MealDetailsRepositoryImpl(searchMealSearchAPI)
    }


}