package pe.edu.upc.eatsexplorer.feature_auth.ui.signin

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import pe.edu.upc.eatsexplorer.shared.ui.CustomButton
import pe.edu.upc.eatsexplorer.shared.ui.InputTextField
import pe.edu.upc.eatsexplorer.shared.ui.PasswordTextField
import pe.edu.upc.eatsexplorer.ui.theme.EatsExplorerTheme

@Composable
fun SignInScreen(navigateTo: ()->Unit){//navigateTo funcion como parametro
    Scaffold {paddingValues ->
        val username = remember { //para que se refresque o se pinte
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
            .fillMaxSize(), //que ocupe todo el ancho
            verticalArrangement = Arrangement.Center //centrar verticalmente
        ) {
            InputTextField(input = username, placeholder = "Username")
            PasswordTextField(input = password , placeholder = "Password")
            // botones
            CustomButton(text = "Sign In", {})
            CustomButton(text = "Sign Up", navigateTo) //navegar a la siguiente pantalla
        }
    }
}

//poner los estados en el view model

/*Iconos
material-icon-extended*/

//agregar la navegacion
