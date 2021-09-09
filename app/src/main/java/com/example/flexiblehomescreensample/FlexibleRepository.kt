package com.example.flexiblehomescreensample

import com.google.gson.Gson
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FlexibleRepository {
    fun getItem(page: Int) : Flow<FlexibleHomePageDto> {
        when(page) {
            1 -> {
                return flow {
                    emit(Gson().fromJson(RawData.firstPage, FlexibleHomePageDto::class.java))
                }
            }
            2 -> {
                return flow {
                    emit(Gson().fromJson(RawData.secondPage, FlexibleHomePageDto::class.java))
                }
            }
            3 -> {
                return flow {
                    emit(Gson().fromJson(RawData.thirdPage, FlexibleHomePageDto::class.java))
                }
            }
            else -> {
                return flow {
                    throw Exception("Out Of Page")
                }
            }
        }
    }
}