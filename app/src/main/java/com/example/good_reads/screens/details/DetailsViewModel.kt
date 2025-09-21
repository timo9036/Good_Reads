package com.example.good_reads.screens.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.good_reads.data.Resource
import com.example.good_reads.model.Item
import com.example.good_reads.repository.BookRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(private val repository: BookRepository) : ViewModel() {

    suspend fun getBookInfo(bookId: String): Resource<Item> {
        viewModelScope.launch {
//            item = repository.getBookInfo(bookId)

        }
        return repository.getBookInfo(bookId)
    }
}