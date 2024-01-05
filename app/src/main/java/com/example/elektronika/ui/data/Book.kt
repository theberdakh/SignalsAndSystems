package com.example.elektronika.ui.data

import androidx.annotation.RawRes

data class Book(
    val id: Int,
    val title: String,
    @RawRes val assetId: Int
)
