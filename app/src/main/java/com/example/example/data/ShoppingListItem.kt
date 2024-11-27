package com.example.example.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shop_list_name")
data class ShoppingListItem(
    @PrimaryKey
    val id:Int?=null,
    val name: String,
    val time:String,
    val allItems: Int,
    val allSelectedItemsCount:Int
)
