package pe.edu.upc.eatsexplorer.feature_auth.data.remote

data class UserResponse(
    val id:String,
    val username: String,
    val lastname: String,
    val firstname: String,
    val password: String
)
