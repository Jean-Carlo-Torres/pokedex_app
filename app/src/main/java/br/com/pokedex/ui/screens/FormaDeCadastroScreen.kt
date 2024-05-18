package br.com.pokedex.ui.screens

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.pokedex.R
import br.com.pokedex.ui.activity.FormularioCadastroUsuarioActivity
import br.com.pokedex.ui.activity.OnboardingActivity
import br.com.pokedex.ui.components.GenericButton
import br.com.pokedex.ui.components.PageHeader

@Composable
fun FormaDeCadastroScreen() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                start = 16.dp,
                end = 16.dp,
                bottom = 16.dp,
                top = 48.dp
            ),
    ) {
        PageHeader(onClick = {
            context.startActivity(
                Intent(
                    context,
                    OnboardingActivity::class.java
                )
            )
        }, title = "Forma de cadastro")
        Image(
            painter = painterResource(id = R.drawable.image145),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(380.dp)
                .padding(top = 50.dp, bottom = 16.dp)
        )
        Text(
            text = "Falta pouco para explorar esse mundo!",
            fontSize = 26.sp,
            fontWeight = FontWeight(500),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Como deseja se conectar?",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(
                    top = 8.dp,
                    bottom = 32.dp
                )
                .align(Alignment.CenterHorizontally)
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            GenericNoFillButton(
                imagem = painterResource(id = R.drawable.ic_apple),
                text = "Continuar com a Apple"
            )
            GenericNoFillButton(
                imagem = painterResource(id = R.drawable.ic_google),
                text = "Continuar com o Google"
            )
            GenericButton(
                text = "Continuar com um e-mail",
                onClick = {
                    context.startActivity(
                        Intent(
                            context,
                            FormularioCadastroUsuarioActivity::class.java
                        )
                    )
                }
            )
        }
    }
}

@Composable
private fun GenericNoFillButton(imagem: Painter, text: String) {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .height(58.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = Color.Unspecified
        ),
        border = BorderStroke(
            1.dp,
            Color.Black
        ),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        Icon(
            painter = imagem,
            contentDescription = null,
            modifier = Modifier
                .width(42.dp)
                .height(42.dp)
                .padding(horizontal = 8.dp)
        )
        Text(
            text = text,
            fontSize = 18.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun CadastroUsuarioScreenPreview() {
    FormaDeCadastroScreen()
}