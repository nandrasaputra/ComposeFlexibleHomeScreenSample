package com.example.flexiblehomescreensample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class MainActivityViewModel(
    private val flexiblePagingSource: FlexiblePagingSource
) : ViewModel() {

    val dataPaging :Flow<PagingData<Data>> = Pager(config = PagingConfig(6)) {
        flexiblePagingSource
    }.flow

    /*var currentPage = -1
    var totalPage = 0

    private var _homeActivityState = MutableStateFlow(MainActivityState(mutableListOf(), false))
    val homeActivityState: StateFlow<MainActivityState> = _homeActivityState

    init {
        loadInitialData()
    }

    private fun loadInitialData() {
        if (currentPage == -1) {
            viewModelScope.launch {
                _homeActivityState.value = homeActivityState.value.copy(isLoading = true)
                val newDto = getItem(1).first()
                val newList = homeActivityState.value.data + newDto.data
                currentPage = 1
                totalPage = newDto.page.totalPage
                _homeActivityState.value = MainActivityState(newList, false)
            }
        }
    }

    fun loadNextData() {
        viewModelScope.launch {
            _homeActivityState.value = homeActivityState.value.copy(
                isLoading = true
            )
            val nextPage = currentPage + 1
            if (nextPage <= totalPage) {
                val newDto = getItem(nextPage).first()
                val newList = homeActivityState.value.data + newDto.data
                currentPage = 1
                totalPage = newDto.page.totalPage
                _homeActivityState.value = MainActivityState(newList, false)
            } else {
                _homeActivityState.value = homeActivityState.value.copy(
                    isLoading = false
                )
            }
        }
    }*/
}

data class MainActivityState(
    val data: List<Data>,
    val isLoading: Boolean
)