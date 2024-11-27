package com.example.example.shoppingList_screen

import com.example.example.data.ShoppingListItem

sealed class ShoppingListEvent {
    data class OnShowDeleteDialog(val item:ShoppingListItem): ShoppingListEvent()
    data class OnShowEditDialog(val item:ShoppingListItem): ShoppingListEvent()
    data class OnItemClick(val route:String): ShoppingListEvent()
    object OnItemSave: ShoppingListEvent()
}