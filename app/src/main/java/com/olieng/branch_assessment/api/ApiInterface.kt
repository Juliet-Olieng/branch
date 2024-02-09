package com.olieng.branch_assessment.api

import com.olieng.branch_assessment.Model.MessagesData
import com.olieng.branch_assessment.Model.MessagesRequest
import com.olieng.branch_assessment.Model.MessagesResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {
    @GET("api/messages")
    suspend fun getMessages():Response<List<MessagesData>>
    @POST("api/messages")
    suspend fun postMessage(@Body messagesRequest: MessagesRequest):Response<MessagesResponse>
}