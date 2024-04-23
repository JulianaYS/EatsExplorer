package pe.edu.upc.eatsexplorer.feature_auth.data.repository

import pe.edu.upc.eatsexplorer.feature_auth.data.remote.AuthService
import pe.edu.upc.eatsexplorer.feature_auth.data.remote.AuthServiceFactory
import pe.edu.upc.eatsexplorer.feature_auth.data.remote.UserRequest
import pe.edu.upc.eatsexplorer.feature_auth.data.remote.UserResponse
import javax.security.auth.callback.Callback

class AuthRepository(val authService: AuthService = AuthServiceFactory.getAuthService() ) {

    fun signIn(username: String, password: String){
        val signIn
    }

    fun signUp(userRequest: UserRequest){
        val signUp = authService.signUp(userRequest)
        signUp.enqueue(object: Callback<UserRequest>{
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>){
                if(response.isSuccessful){
                    val userResponse = response.body() as UserResponse
                    callba
                }
            }
        })
    }
}