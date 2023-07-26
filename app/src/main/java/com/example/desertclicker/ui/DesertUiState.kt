package com.example.desertclicker.ui

import androidx.annotation.DrawableRes
import com.example.desertclicker.data.Datasource.dessertList

data class DesertUiState (
    var revenue: Int = 0,
    var dessertsSold: Int = 0,
    val currentDessertIndex: Int = 0,
    val currentDessertPrice: Int = dessertList[currentDessertIndex].price,
    @DrawableRes val currentDessertImageId: Int = dessertList[currentDessertIndex].imageId
    )