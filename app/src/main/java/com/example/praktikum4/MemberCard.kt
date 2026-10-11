package com.example.praktikum4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum4.ui.theme.TextSecondary
import com.example.praktikum4.ui.theme.TextWhite
import com.example.praktikum4.ui.theme.TextYellowLight

@Composable
fun MemberCard(
    nama: String,
    alamat: String,
    warnaBackground: Color,
    modifier: Modifier = Modifier,
    nomorTelepon: String? = null,
    fontFamily: FontFamily? = null
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = warnaBackground),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Logo Kiri
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(R.string.logo_description),
                modifier = Modifier.size(48.dp)




































                        // Logo Kanan
                        Image(
                        painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(R.string.logo_description),
                modifier = Modifier.size(48.dp)