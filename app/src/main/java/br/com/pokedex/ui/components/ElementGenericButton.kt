package br.com.pokedex.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.pokedex.R
import br.com.pokedex.model.ElementGenericButtonProperties

@Composable
fun GenericButton(properties: ElementGenericButtonProperties) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                properties.backgroundColor,
                contentColor = properties.contentColor
            ),
            modifier = Modifier
                .widthIn(min = 114.dp)
                .height(36.dp)
        ) {
            Box(
                modifier = Modifier
                    .background(
                        Color.White,
                        shape = CircleShape
                    )
                    .clip(CircleShape)
            ) {
                Image(
                    painter = properties.icon,
                    contentDescription = null,
                    modifier = Modifier
                        .width(18.dp)
                        .height(18.dp)
                        .padding(horizontal = 4.dp)
                )
            }
            Text(
                properties.text,
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 4.dp)
            )
        }
    }
}

@Composable
fun ElementEvolutionButton(properties: ElementGenericButtonProperties) {
    Row {
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                properties.backgroundColor,
                contentColor = properties.contentColor
            ),
            modifier = Modifier
                .width(68.dp)
                .height(24.dp)
        ) {
            Image(
                painter = properties.icon,
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp) // Set base size
                    .scale(1.2f),
                colorFilter = ColorFilter.tint(Color.White)
            )
        }
    }
}


@Preview
@Composable
private fun ButtonGrassPreview() {
    GenericButton(
        ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_grass),
            text = "Grama",
            backgroundColor = Color(0xFF00B050),
        )
    )
}

@Preview
@Composable
private fun ElementEvolutionButton() {
    ElementEvolutionButton(
        ElementGenericButtonProperties(
            icon = painterResource(id = R.drawable.ic_grass),
            backgroundColor = Color(0xFF00B050),
        )
    )
}

