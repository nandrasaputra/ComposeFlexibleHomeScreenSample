package com.example.flexiblehomescreensample

data class FlexibleHomePageDto(
    val data: List<Data>,
    val page: Page,
    val widgetCount: Int
)

data class Page(
    val currentPage: Int,
    val totalPages: Int
)

data class Data(
    val widgetId: String,
    val widgetType: String,
    val lastUpdate: String,
    val carousel: Carousel?,
    val slider: Slider?,
    val floatingButton: FloatingButton?,
    val collection: Collection?
)

data class Carousel(
    val items: List<CarouselItem>,
)

data class CarouselItem(
    val itemId: String,
    val image: String
)

data class Slider(
    val title: String,
    val items: List<SliderItem>
)

data class SliderItem(
    val itemId: String,
    val image: String,
    val title: String
)

data class FloatingButton(
    val title: String,
    val description: String,
    val image: String
)

data class Collection(
    val title: String,
    val navigationText: String,
    val items: List<CollectionItem>
)

data class CollectionItem(
    val itemId: String,
    val image: String,
    val title: String,
    val uom: String,
    val price: Double
)