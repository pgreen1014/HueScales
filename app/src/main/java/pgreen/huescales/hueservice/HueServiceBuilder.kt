package pgreen.huescales.hueservice

import pgreen.huescales.hueservice.repository.HueServiceRepository
import retrofit2.Retrofit

class HueServiceBuilder(private val hueServiceRepository: HueServiceRepository) {

    fun getService(): Retrofit = Retrofit.Builder()
            .baseUrl(hueServiceRepository.getHueBridgeBaseUrl())
            .build()

}