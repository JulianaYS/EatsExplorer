package pe.edu.upc.eatsexplorer.feature_auth.data.remote

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface AuthService {
    @GET("users") //endpoint ruta
    fun signIn(
        @Query("username") username:String,
        @Query("password") password:String
    ): Call<List<UserResponse>>
    //el query son condiciones
    @POST("users")
    fun signUp(@Body request: UserRequest): Call<UserResponse>
    //lo envia en el cuerpo
}