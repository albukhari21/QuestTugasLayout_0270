package com.example.praktikum4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum4.ui.theme.BlueCard
import com.example.praktikum4.ui.theme.DarkGrayCard
import com.example.praktikum4.ui.theme.GreenCard
import com.example.praktikum4.ui.theme.Praktikum4Theme
import com.example.praktikum4.ui.theme.PurpleCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Praktikum4Theme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 16.dp, vertical = 12.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
// Header Section
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.header_title),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = stringResource(R.string.header_subtitle),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.7f),
                    textAlign = TextAlign.Center
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Card List Section
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                // Card 1: Reza Ricardo (no phone)
                MemberCard(
                    nama = stringResource(R.string.member_1_name),
                    alamat = stringResource(R.string.member_1_address),
                    warnaBackground = DarkGrayCard,
                    nomorTelepon = null
                )

                // Card 2: Albert Wesker
                MemberCard(
                    nama = stringResource(R.string.member_2_name),
                    nomorTelepon = stringResource(R.string.member_2_phone),
                    alamat = stringResource(R.string.member_2_address),
                    warnaBackground = PurpleCard
                )

                // Card 3: Ada Wong
                MemberCard(
                    nama = stringResource(R.string.member_3_name),
                    nomorTelepon = stringResource(R.string.member_3_phone),
                    alamat = stringResource(R.string.member_3_address),
                    warnaBackground = BlueCard
                )

                // Card 4: Ashley Graham
                MemberCard(
                    nama = stringResource(R.string.member_4_name),
                    nomorTelepon = stringResource(R.string.member_4_phone),
                    alamat = stringResource(R.string.member_4_address),
                    warnaBackground = GreenCard
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Footer Section
            Text(
                text = stringResource(R.string.footer_copyright),
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.5f),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainScreenPreview() {
    Praktikum4Theme {
        MainScreen()
    }
}