package com.messieyawo.advancedfoodapp.di

import com.messieyawo.advancedfoodapp.data.network.FoodRecipesApi
import com.messieyawo.advancedfoodapp.utils.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetWorkModule {

    /**
     * this will provide dependencies and satisfy
     *  okHttpClient: OkHttpClient
     *  in provideRetrofitInstance
     * **/
    @Singleton
    @Provides
    fun provideHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .readTimeout(15, TimeUnit.SECONDS)
            .connectTimeout(15, TimeUnit.SECONDS)
            .build()
    }

    /**
     * this will provide dependencies and satisfy
     *  gsonConverterFactory: GsonConverterFactory
     *  in provideRetrofitInstance
     * **/
    @Singleton
    @Provides
    fun provideConverterFactory(): GsonConverterFactory {
        return GsonConverterFactory.create()
    }

/**
 * This is to provide retrofit instance to satisfy (retrofit: Retrofit) below
 * next we also need to create a function to provide
 *  okHttpClient and gsonConverterFactory
 * **/
@Singleton
@Provides
fun provideRetrofitInstance(
        okHttpClient: OkHttpClient,
        gsonConverterFactory: GsonConverterFactory
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(gsonConverterFactory)
            .build()
    }



    /**
     * we annotate with @Singleton and @Provides because
     * (retrofit: Retrofit) is a third party library
     * this will provide FoodRecipesApi::class.java to the application component
     * **/
    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): FoodRecipesApi {
        return retrofit.create(FoodRecipesApi::class.java)
    }


}