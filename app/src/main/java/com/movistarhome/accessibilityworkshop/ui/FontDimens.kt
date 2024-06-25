package com.movistarhome.accessibilityworkshop.ui

import androidx.annotation.DimenRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.movistarhome.accessibilityworkshop.R

@Composable
@ReadOnlyComposable
fun fontDimensionResource(@DimenRes id: Int) = dimensionResource(id = id).value.sp

object FontDimens {
    val Display1: TextUnit
        @Composable get() = fontDimensionResource(R.dimen.display1)
    val Display2: TextUnit
        @Composable get() = fontDimensionResource(R.dimen.display2)
    val Title1: TextUnit
        @Composable get() = fontDimensionResource(R.dimen.title1)
    val Title2: TextUnit
        @Composable get() = fontDimensionResource(R.dimen.title2)
    val Body1: TextUnit
        @Composable get() = fontDimensionResource(R.dimen.body1)
    val Body2: TextUnit
        @Composable get() = fontDimensionResource(R.dimen.body2)
    val Body3: TextUnit
        @Composable get() = fontDimensionResource(R.dimen.body3)
    val Body4: TextUnit
        @Composable get() = fontDimensionResource(R.dimen.body4)
    val Body5: TextUnit
        @Composable get() = fontDimensionResource(R.dimen.body5)
    val Label1: TextUnit
        @Composable get() = fontDimensionResource(R.dimen.label1)
    val Label2: TextUnit
        @Composable get() = fontDimensionResource(R.dimen.label2)
}