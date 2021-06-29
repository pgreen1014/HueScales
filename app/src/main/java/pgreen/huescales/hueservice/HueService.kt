package pgreen.huescales.hueservice

import pgreen.huescales.hueservice.models.lights.HueLight
import retrofit2.Call
import retrofit2.http.GET

interface HueService {

    @GET("lights")
    fun listRepos(): Call<HueLight>

}