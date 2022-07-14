package com.example.photontest.repo.remote

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object SchoolRetroInstance {
    private const val BASE_URL = "https://data.cityofnewyork.us/resource/"

    private val client = HttpLoggingInterceptor()
        .apply { level = HttpLoggingInterceptor.Level.BODY }
        .let { OkHttpClient.Builder().addInterceptor(it).build() }

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .client(client)
        .build()

    val schoolService: SchoolService by lazy { retrofit.create(SchoolService::class.java) }
}