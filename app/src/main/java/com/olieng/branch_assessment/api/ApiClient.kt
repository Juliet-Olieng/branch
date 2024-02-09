package com.olieng.branch_assessment.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    var retrofit=Retrofit.Builder()
        .baseUrl("https://android-messaging.branch.co/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
     fun <T> builClient(apiInterface: Class<T>):T{
         return retrofit.create(apiInterface)
     }
}