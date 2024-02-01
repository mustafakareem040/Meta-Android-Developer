package com.example.littlelemon.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


private val LightColorPalette = lightColors(
    primary = LittleLemonColor.yellow,
    primaryVariant = LittleLemonColor.yellow,
    secondary = LittleLemonColor.pink

)

@Composable
fun LittleLemonTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        colors = LightColorPalette,
        typography = Typography(h1 = TextStyle(
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = LittleLemonColor.charcoal
        ),
            h2 = TextStyle(
                color = LittleLemonColor.charcoal,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            ),
            body1 = TextStyle(
                color = LittleLemonColor.green
            ),
            body2 = TextStyle(
                fontWeight = FontWeight.Bold,
                color = LittleLemonColor.green
            ),
            button = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )),
        shapes = Shapes,
        content = content
    )
}
