package pe.edu.upc.eatsexplorer.feature_auth.data.remote

import retrofit2.Callback
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface AuthService {
    @GET("users")
    fun signIn(@Query("username") username:String, @Query("password") password:String): Call<list<UserResponse>>

    @POST("users")
    fun signUp(@Body request: User)
}