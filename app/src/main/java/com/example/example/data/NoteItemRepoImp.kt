package com.example.example.data

import kotlinx.coroutines.flow.Flow

class NoteItemRepoImp(
    private val dao: NoteDao
): NoteItemRepo {
    override suspend fun insertItem(item: NoteItem) {
        dao.insertItem(item)
    }

    override suspend fun deleteItem(item: NoteItem) {
        dao.deleteItem(item)
    }

    override fun getAllItems(): Flow<List<NoteItem>> {
        return  dao.getAllItems()
    }

    override suspend fun getNoteItemById(id: Int): NoteItem {
       return dao.getNoteItemById(id)
    }
}