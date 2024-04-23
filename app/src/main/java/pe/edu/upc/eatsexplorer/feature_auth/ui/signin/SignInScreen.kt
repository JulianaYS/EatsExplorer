package pe.edu.upc.eatsexplorer.feature_auth.ui.signin

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.upc.eatsexplorer.ui.theme.EatsExplorerTheme

@Composable
fun SignInScreen(){
    Scaffold {paddingValues ->
        val username = remember {
            mutableStateOf("")
        }
        val password = remember {
            mutableStateOf("")
        }
        val isPasswordVisible = remember {
            mutableStateOf(false)
        }

        Column(modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize()) {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                placeholder = {
                    Text(text = "Username")
                },
                value = username.value, onValueChange = {
                    username.value=it
                })
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                placeholder = {
                    Text(text = "Password")
                },
                visualTransformation = if (isPasswordVisible.value) VisualTransformation.None
                else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                value = password.value, onValueChange = {
                    password.value = it
                },
                trailingIcon={
                    IconButton(onClick = {
                        isPasswordVisible.value = !isPasswordVisible.value
                    }) {
                        Icon(Icons.Filled.Visibility, "Password")

                    }

                })

        }
    }
}

@Preview
@Composable
fun SignInScreenPreview(){
    EatsExplorerTheme {
        SignInScreen()
    }
}


/*Iconos
material-icon-extended*/