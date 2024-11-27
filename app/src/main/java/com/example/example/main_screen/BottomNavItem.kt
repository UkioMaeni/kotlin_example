package com.example.example.main_screen

import com.example.example.R
import com.example.example.utils.Routes

sealed class BottomNavItem(
    val title:String,
    val iconId:Int,
    val route:String
) {
    object ListItem : BottomNavItem("List", R.drawable.list_icon,Routes.SHOPPING_LIST)
    object NoteItem : BottomNavItem("List", R.drawable.note_icon,Routes.NOTE_LIST)
    object AboutItem : BottomNavItem("List", R.drawable.add_icon,Routes.ABOUT)
    object SettingsItem : BottomNavItem("List", R.drawable.settings_icon,Routes.SETTINGS)
}