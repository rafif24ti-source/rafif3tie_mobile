package com.example.rafif_3tie_mobile.Home.Data.api

import com.example.rafif_3tie_mobile.Home.Data.model.PhotoModel
import retrofit2.http.GET

interface PhotoApiService {
    @GET("list")
    suspend fun getPhotos(): List<PhotoModel>
}