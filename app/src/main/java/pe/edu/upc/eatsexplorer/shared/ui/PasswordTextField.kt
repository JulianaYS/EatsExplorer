package pe.edu.upc.eatsexplorer.shared.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

@Composable
fun PasswordTextField(input: MutableState<String>, placeholder: String){
    val isPasswordVisible = remember {
        mutableStateOf(false)
    }

    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        placeholder = {
            Text(text = "Password")
                },
        //para que se vea la contraseña
        visualTransformation = if (isPasswordVisible.value) {
            VisualTransformation.None
        } else {
            PasswordVisualTransformation()
               },
        // para que se vea el teclado de contraseña
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        value = input.value, onValueChange = {
            input.value = it },
        // para que se vea el icono de visibilidad
        trailingIcon={
            IconButton(onClick = {
                isPasswordVisible.value = !isPasswordVisible.value
            }){
                Icon(
                    if(isPasswordVisible.value){
                        Icons.Filled.VisibilityOff
                    } else{
                        Icons.Filled.Visibility
                          },"Password")
            }
        })
}


