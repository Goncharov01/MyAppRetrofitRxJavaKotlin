package com.example.myappkotlin.Retrofit

import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {

    @GET("api/task")
    fun getTask():Observable<List<TaskModel>>

}