package com.example.flexiblehomescreensample

import androidx.paging.PagingSource
import androidx.paging.PagingState
import kotlinx.coroutines.flow.first

class FlexiblePagingSource(
    private val flexibleRepository: FlexibleRepository
) : PagingSource<Int, Data>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Data> {
        return try {
            val currentKey = params.key ?: 1
            val response = flexibleRepository.getItem(currentKey).first()
            val totalPage = response.page.totalPages
            val nextKey = if (currentKey < totalPage) (currentKey.plus(1)) else null
            val previousKey = if (currentKey == 1) null else currentKey.minus(1)

            LoadResult.Page(
                data = response.data,
                prevKey = previousKey,
                nextKey = nextKey
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, Data>): Int? {
        return null
    }
}