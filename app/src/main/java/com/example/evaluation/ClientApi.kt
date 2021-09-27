package com.example.evaluation

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ClientApi {
    @GET("search")
    fun getApi(@Query("term")term:String):Call<ResponseDTO>
}