package com.example.example.di

import android.app.Application
import androidx.room.Room
import com.example.example.data.AddItemRepo
import com.example.example.data.AddItemRepoImp
import com.example.example.data.MainDB
import com.example.example.data.NoteItemRepo
import com.example.example.data.NoteItemRepoImp
import com.example.example.data.ShoppingListDao
import com.example.example.data.ShoppingListItem
import com.example.example.data.ShoppingListRepo
import com.example.example.data.ShoppingListRepoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideMainDB(app:Application) : MainDB{
        return Room.databaseBuilder(
            app,
            MainDB::class.java,
            "shop_list_db"
        ).build()
    }
    @Provides
    @Singleton
    fun provideShopRepo(db:MainDB):ShoppingListRepo{
        return ShoppingListRepoImpl(db.shoppingListDao)
    }
    @Provides
    @Singleton
    fun provideNoteItemRepo(db:MainDB):NoteItemRepo{
        return NoteItemRepoImp(db.noteDao)
    }
    @Provides
    @Singleton
    fun provideAddItemRepo(db:MainDB):AddItemRepo{
        return AddItemRepoImp(db.addDao)
    }
}