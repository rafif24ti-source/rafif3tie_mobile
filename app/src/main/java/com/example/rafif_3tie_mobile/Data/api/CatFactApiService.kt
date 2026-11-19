package com.example.rafif_3tie_mobile.Data.api

import com.example.rafif_3tie_mobile.Data.model.CatFactModel
import retrofit2.http.GET

interface CatFactApiService {
    @GET("fact")
    suspend fun getCatFact(): CatFactModel
}