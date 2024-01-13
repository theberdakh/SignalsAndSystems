package com.example.elektronika.ui.data.model

import androidx.annotation.RawRes
import com.example.elektronika.ui.data.repository.Category

data class Book(
    val id: Int,
    val title: String,
    @RawRes val assetId: Int,
    val section: Category
)
