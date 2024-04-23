package pe.edu.upc.eatsexplorer.feature_auth.data.remote

import pe.edu.upc.eatsexplorer.core_network.RetrofitFactory

class AuthServiceFactory private constructor(){
    companion object{
        fun getAuthServiceFactory(): AuthService{
            return RetrofitFactory.getRetrofit().create
        }
    }
}