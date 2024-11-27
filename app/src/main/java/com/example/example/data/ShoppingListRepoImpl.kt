package com.example.example.data

import kotlinx.coroutines.flow.Flow

class ShoppingListRepoImpl(
    private val dao:ShoppingListDao
):ShoppingListRepo {
    override suspend fun insertItem(item: ShoppingListItem) {
        dao.insertItem(item)
    }

    override suspend fun deleteItem(item: ShoppingListItem) {
        dao.deleteItem(item)
    }

    override fun getAllItems(): Flow<List<ShoppingListItem>> {
       return dao.getAllItems()
    }

}