package pe.edu.upc.eatsexplorer.feature_restaurant.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "restaurants")
data class RestaurantEntity(
    @PrimaryKey
    val id: Int,
)

/*
* Para usar Room
* 1. Crear la entidad
* 2. Crear el DAO (metodos de insert, update, delete, fetchById)
* 3. Crear la base de datos (abstract class que extiende de RoomDatabase)
* */