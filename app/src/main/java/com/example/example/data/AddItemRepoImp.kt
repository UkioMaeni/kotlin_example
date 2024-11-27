package com.example.example.data

import kotlinx.coroutines.flow.Flow

class AddItemRepoImp(
    private val dao:AddDao
) : AddItemRepo{
    override suspend fun insertItem(item: AddItem) {
        dao.insertItem(item)
    }

    override suspend fun insertItem(item: ShoppingListItem) {
        dao.insertItem(item)
    }

    override suspend fun deleteItem(item: AddItem) {
        dao.deleteItem(item)
    }

    override fun getAllItemById(listId: Int): Flow<List<AddItem>> {
       return dao.getAllItemById(listId)
    }

    override suspend fun getListItemById(listId: Int): ShoppingListItem {
        return  dao.getListItemById(listId)
    }
}