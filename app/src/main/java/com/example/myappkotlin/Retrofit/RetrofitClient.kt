package com.example.myappkotlin.Retrofit

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object {
        fun create(): ApiService {

            val retriofit = Retrofit.Builder()
                .baseUrl("https://taskemployee.herokuapp.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retriofit.create(ApiService::class.java)

        }
    }

}
