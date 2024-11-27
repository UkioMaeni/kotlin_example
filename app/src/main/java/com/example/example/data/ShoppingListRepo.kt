package com.example.example.data

import kotlinx.coroutines.flow.Flow

interface ShoppingListRepo {
    suspend fun insertItem(item: ShoppingListItem)
    suspend fun deleteItem(item: ShoppingListItem)
    fun getAllItems(): Flow<List<ShoppingListItem>>
}