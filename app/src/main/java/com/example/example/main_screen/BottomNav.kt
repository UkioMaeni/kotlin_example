package com.example.example.main_screen

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.example.ui.theme.BlueLight


@Composable
fun BottomNav(navController: NavHostController) {
    val listItems = listOf(
        BottomNavItem.ListItem,
        BottomNavItem.NoteItem,
        BottomNavItem.AboutItem,
        BottomNavItem.SettingsItem
    )
    BottomNavigation(
        backgroundColor = Color.White
    ) {
    listItems.forEach{item->
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        BottomNavigationItem(
            selected = navBackStackEntry?.destination?.route ==item.route,
            onClick = {
                navController.navigate(item.route)
            },
            icon = { Icon(painter = painterResource(id = item.iconId), contentDescription = "z") },
            label = {
                Text(text = item.title)
            },
            selectedContentColor = BlueLight,
            unselectedContentColor = Color.Gray,
            alwaysShowLabel = false
        )
            
    }
    }
}