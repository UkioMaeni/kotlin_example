package com.example.example.data

import androidx.room.Database
import androidx.room.DatabaseConfiguration
import androidx.room.InvalidationTracker
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteOpenHelper

@Database(
    entities = [ShoppingListItem::class,AddItem::class,NoteItem::class ],
    version = 1
)
abstract class MainDB : RoomDatabase() {
    abstract  val shoppingListDao:ShoppingListDao
    abstract  val addDao:AddDao
    abstract  val noteDao:NoteDao
}