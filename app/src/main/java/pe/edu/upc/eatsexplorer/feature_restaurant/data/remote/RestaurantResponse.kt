package pe.edu.upc.eatsexplorer.feature_restaurant.data.remote


//
typealias RestaurantsResponse = List<RestaurantResponse>
//los datos que retorna el endpoint
data class RestaurantResponse(
    val id: Int,
    val title: String,
    val poster: String
)
