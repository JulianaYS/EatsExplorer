package pe.edu.upc.eatsexplorer.core_network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory private constructor(){
    companion object {
        fun getRetrofit(): Retrofit{ // te devuelve objeto tipo retrofit
            return Retrofit
                .Builder()
                .baseUrl(ApiClient.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}