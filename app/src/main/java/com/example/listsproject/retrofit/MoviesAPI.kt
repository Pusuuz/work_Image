package com.example.listsproject.retrofit

import com.example.listsproject.model.Response
import retrofit2.Call
import retrofit2.http.GET

interface MoviesAPI {


    @GET("movie/popular")
    fun getMovieList(): Call<Response>
}