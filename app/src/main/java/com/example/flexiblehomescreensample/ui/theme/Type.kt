package com.example.flexiblehomescreensample.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.flexiblehomescreensample.R

val dmSans = FontFamily(
    Font(R.font.dmsans_regular),
    Font(R.font.dmsans_medium, FontWeight.W500),
    Font(R.font.dmsans_bold, FontWeight.W700)
)

val Typography = Typography(
    defaultFontFamily = dmSans,
    body1 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)