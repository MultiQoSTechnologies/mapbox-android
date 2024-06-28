package com.app.mapboxsample

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MapboxApi {

    @GET("directions/v5/mapbox/cycling/{location}")
    suspend fun getCoordinates(
        @Path("location") location: String,
        @Query("geometries") geometries: String,
        @Query("access_token") access_token: String
    ): Response<CoordinateResponse>
}