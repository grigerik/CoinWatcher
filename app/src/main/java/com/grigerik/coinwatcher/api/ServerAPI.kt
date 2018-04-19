package com.grigerik.coinwatcher.api

import com.grigerik.coinwatcher.models.CoinCap
import kotlinx.coroutines.experimental.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface ServerAPI {
    @GET("ticker")
    fun loadData(@Query("limit") limit:Int=10):Deferred<List<CoinCap>>
}