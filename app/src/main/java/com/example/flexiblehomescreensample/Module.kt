package com.example.flexiblehomescreensample

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val flexibleModule = module {
    factory { FlexiblePagingSource(get()) }
    factory { FlexibleRepository() }
    viewModel {
        MainActivityViewModel(get())
    }
}