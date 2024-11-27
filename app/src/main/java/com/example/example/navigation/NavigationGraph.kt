package com.example.example.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.example.about_screen.AboutScreen
import com.example.example.noteList_screen.NoteListScreen
import com.example.example.settings_screen.SettingsScreen
import com.example.example.shoppingList_screen.ShoppingListScreen
import com.example.example.utils.Routes

@Composable
fun NavigationGraph(navController:NavHostController) {


    NavHost(navController = navController, startDestination = Routes.SHOPPING_LIST){
       composable(Routes.SHOPPING_LIST) {
           ShoppingListScreen()
       }
        composable(Routes.NOTE_LIST) {
            NoteListScreen()
        }
        composable(Routes.ABOUT) {
            AboutScreen()
        }
        composable(Routes.SETTINGS) {
            SettingsScreen()
        }
    }
}