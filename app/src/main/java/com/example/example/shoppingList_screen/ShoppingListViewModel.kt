package com.example.example.shoppingList_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.example.data.ShoppingListItem
import com.example.example.data.ShoppingListRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ShoppingListViewModel @Inject constructor(
    private  val repository:ShoppingListRepo
):ViewModel() {

    private var listItem: ShoppingListItem?=null;

    fun onEvent(event: ShoppingListEvent){
        when(event){
            is ShoppingListEvent.OnItemSave ->{
                viewModelScope.launch {
                    repository.insertItem(
                        ShoppingListItem(
                            listItem?.id,
                            "list 1",
                            "12-12-2023",
                            listItem?.allItems ?: 0,
                            listItem?.allSelectedItemsCount ?: 0
                        )
                    )
                }
            }
            is ShoppingListEvent.OnItemClick ->{

            }
            is ShoppingListEvent.OnShowEditDialog ->{
                listItem=event.item;
            }
            is ShoppingListEvent.OnShowDeleteDialog ->{

            }
        }
    }
}