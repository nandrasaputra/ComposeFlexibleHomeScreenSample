package com.example.flexiblehomescreensample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstrainScope
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import com.example.flexiblehomescreensample.ui.theme.FlexibleHomeScreenSampleTheme
import com.example.flexiblehomescreensample.ui.theme.blackNotReally
import com.example.flexiblehomescreensample.ui.theme.blackShade
import com.example.flexiblehomescreensample.ui.theme.blueSilk
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import com.skydoves.landscapist.glide.GlideImage
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*

@ExperimentalPagerApi
class MainActivity : ComponentActivity() {

    private val viewModel: MainActivityViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlexibleHomeScreenSampleTheme {
                // A surface container using the 'background' color from the theme
                Scaffold {
                    Column(modifier = Modifier.fillMaxSize()) {
                        TopAppBar(title = { Text(text = "Warung") },)
                        Surface(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f),
                            color = Color(0xFFFAFAFA)
                        ) {
                            val flexiblePaging: LazyPagingItems<Data> = viewModel.dataPaging.collectAsLazyPagingItems()
                            val lazyListState = rememberLazyListState()
                            LazyColumn(state = lazyListState) {
                                items(flexiblePaging) { data ->
                                    when (toWidgetType(data?.widgetType)) {
                                        WidgetType.TYPE_CAROUSEL -> {
                                            data?.carousel?.let { CarouselView(it) }
                                        }
                                        WidgetType.TYPE_FLOATING_BUTTON -> {
                                            data?.floatingButton?.let { FloatingButtonView(it) }
                                        }
                                        WidgetType.TYPE_SLIDER -> {
                                            data?.slider?.let { SliderView(it) }
                                        }
                                        WidgetType.TYPE_COLLECTION -> {
                                            data?.collection?.let { CollectionView(it) }
                                        }
                                        WidgetType.UNKNOWN -> {
                                            // REACT TO UNKNOWN WIDGET
                                        }
                                    }
                                    Spacer(modifier = Modifier.height(16.dp))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@ExperimentalPagerApi
@Composable
fun CarouselView(carousel: Carousel) {
    val pagerState = rememberPagerState(pageCount = carousel.items.size)
    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(2f),
    ) {
        val (imageConstraint, indicatorConstraint) = createRefs()
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.constrainAs(imageConstraint) {
                matchParent()
            }) { page ->
            val currentItem = carousel.items[page]
            GlideImage(
                imageModel = currentItem.image
            )
        }
        HorizontalPagerIndicator(
            pagerState = pagerState,
            activeColor = Color(0xFFFD3F92),
            inactiveColor = Color.Gray,
            indicatorWidth = 12.dp,
            indicatorHeight = 12.dp,
            modifier = Modifier.constrainAs(indicatorConstraint) {
                bottom.linkTo(parent.bottom, 8.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )
    }
}

@Composable
fun SliderView(slider: Slider) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = slider.title,
            modifier = Modifier.padding(horizontal = 16.dp),
            style = MaterialTheme.typography.h5.copy(
                fontWeight = FontWeight.W700,
                fontSize = 18.sp
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.horizontalScroll(scrollState)
        ) {
            slider.items.forEachIndexed { index, item ->
                Row {
                    if (index == 0) {
                        Spacer(modifier = Modifier.width(16.dp))
                    }
                    Column(
                        modifier = Modifier
                            .width(64.dp)
                            .clip(RoundedCornerShape(4.dp))
                            .clickable { }
                            .padding(horizontal = 4.dp),
                        verticalArrangement = Arrangement.Center,
                    ) {
                        GlideImage(
                            imageModel = item.image,
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(4.dp)
                                .aspectRatio(1f, true),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = item.title,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.body1.copy(
                                fontSize = 12.sp
                            ),
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis
                        )
                        Spacer(modifier = Modifier.padding(bottom = 4.dp))
                    }
                    Spacer(
                        modifier = Modifier.width(
                            if (slider.items.size - 1 == index) 16.dp else 8.dp
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun FloatingButtonView(floatingButton: FloatingButton) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .shadow(2.dp, RoundedCornerShape(8.dp))
            .clickable { }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            if (floatingButton.image.isNotEmpty()) {
                GlideImage(imageModel = floatingButton.image, modifier = Modifier.size(32.dp))
                Spacer(modifier = Modifier.width(16.dp))
            }
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = floatingButton.title,
                    style = MaterialTheme.typography.subtitle1.copy(
                        fontWeight = FontWeight.W500,
                        color = blackNotReally
                    )
                )
                Text(text = floatingButton.description, style = MaterialTheme.typography.body2)
            }
            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_arrow_forward),
                contentDescription = null,
                modifier = Modifier.size(24.dp),
                colorFilter = ColorFilter.tint(Color.Black)
            )
        }
    }
}

@Composable
fun CollectionView(collection: Collection) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = collection.title, modifier = Modifier
                .fillMaxWidth(),
            style = MaterialTheme.typography.h5.copy(
                fontWeight = FontWeight.W700,
                fontSize = 18.sp
            )
        )
        collection.items.windowed(2, 2, true)
            .map { it }.forEachIndexed { index, subList ->
                Column {
                    if (index == 0) {
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                    Row(modifier = Modifier.fillMaxWidth()) {
                        CollectionItemView(
                            item = subList[0], modifier = Modifier
                                .weight(1f)
                                .padding(end = 8.dp)
                        )
                        if (subList.size == 2) {
                            CollectionItemView(
                                item = subList[1], modifier = Modifier
                                    .weight(1f)
                                    .padding(start = 8.dp)
                            )
                        } else {
                            Spacer(
                                modifier = Modifier
                                    .weight(1f)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .clip(RoundedCornerShape(8.dp))
                .border(
                    border = BorderStroke(1.dp, blueSilk),
                    shape = RoundedCornerShape(8.dp)
                )
                .clickable { }
                .padding(horizontal = 16.dp, vertical = 8.dp),
            color = Color.Transparent
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 2.dp)
            ) {
                Text(
                    text = collection.navigationText,
                    modifier = Modifier.weight(1f),
                    style = MaterialTheme.typography.subtitle1.copy(
                        color = blueSilk,
                        fontWeight = FontWeight.W500
                    ),
                    textAlign = TextAlign.Center
                )
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_arrow_forward),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp),
                    colorFilter = ColorFilter.tint(blueSilk)
                )
            }
        }
    }
}

@Composable
fun CollectionItemView(item: CollectionItem, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .shadow(2.dp, RoundedCornerShape(16.dp))
            .clickable { }
    ) {
        Column {
            GlideImage(
                imageModel = item.image,
                modifier = Modifier
                    .aspectRatio(1f),
            )
            Surface(
                modifier = Modifier.padding(vertical = 8.dp, horizontal = 12.dp)
            ) {
                Column {
                    Text(
                        text = item.title,
                        style = MaterialTheme.typography.subtitle1.copy(
                            fontWeight = FontWeight.W500,
                            color = blackNotReally
                        ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "per ${item.uom}",
                        style = MaterialTheme.typography.body1.copy(
                            fontSize = 12.sp,
                            color = blackShade
                        )
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = item.price.convertToRupiah(),
                        style = MaterialTheme.typography.subtitle1.copy(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.W700
                        )
                    )
                }
            }
        }
    }
}

fun ConstrainScope.matchParent() {
    top.linkTo(parent.top)
    start.linkTo(parent.start)
    end.linkTo(parent.end)
    bottom.linkTo(parent.bottom)
}

fun Double.convertToRupiah(): String {
    val idLocale = Locale("in", "ID")
    val symbol = DecimalFormatSymbols(idLocale)
    symbol.groupingSeparator = '.'
    symbol.decimalSeparator = ','
    val formatter = DecimalFormat("###,###,##0.0#", symbol)
    return if (this >= 0) {
        val formattedPrice = String.format(idLocale, "%s", formatter.format(this))
            .let { if (it.endsWith(",0")) it.substring(0, it.length - 2) else it }
        "Rp $formattedPrice"
    } else {
        val formattedPrice = String.format(idLocale, "%s", formatter.format(-this))
            .let { if (it.endsWith(",0")) it.substring(0, it.length - 2) else it }
        "-Rp $formattedPrice"
    }
}

enum class WidgetType(val value: String) {
    TYPE_CAROUSEL("Carousel"),
    TYPE_FLOATING_BUTTON("FloatingButton"),
    TYPE_SLIDER("Slider"),
    TYPE_COLLECTION("Collection"),
    UNKNOWN("Unknown")
}

fun toWidgetType(input: String?) : WidgetType {
    return when(input) {
        WidgetType.TYPE_CAROUSEL.value -> WidgetType.TYPE_CAROUSEL
        WidgetType.TYPE_FLOATING_BUTTON.value -> WidgetType.TYPE_FLOATING_BUTTON
        WidgetType.TYPE_SLIDER.value -> WidgetType.TYPE_SLIDER
        WidgetType.TYPE_COLLECTION.value -> WidgetType.TYPE_COLLECTION
        else -> WidgetType.UNKNOWN
    }
}