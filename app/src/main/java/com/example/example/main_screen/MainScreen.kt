package com.example.example.main_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.example.R
import com.example.example.navigation.NavigationGraph
import com.example.example.ui.theme.BlueLight

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val navigationBarHeight = 80.dp
    val fabOffset = 16.dp
    val offset = (navigationBarHeight / 2) + fabOffset
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNav(navController)
        },
        floatingActionButton = {
            Box {
                FloatingActionButton(onClick = {}, modifier = Modifier.offset(y = offset)) {
                    Icon(
                        painter = painterResource(id = R.drawable.add_icon),
                        contentDescription = "add_icon"
                    )
                }
            }
        },

        floatingActionButtonPosition = FabPosition.Center,

    ) {
        NavigationGraph(navController)
    }
}