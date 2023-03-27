package com.example.productstoreapi.network

import com.example.productstoreapi.network.response.Product
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface StoreService {

    @GET("/products")
    fun getAllProducts(): Call<List<Product>>

    @GET("products/category/electronics")
    fun getElectronicProduct(): Call<List<Product>>

    @GET("products/category/jewelery")
    fun getJeweleryProduct(): Call<List<Product>>

    @GET("products/category/men's clothing")
    fun getMenProduct(): Call<List<Product>>

    @GET("products/category/women's clothing")
    fun getWomenProduct(): Call<List<Product>>

}