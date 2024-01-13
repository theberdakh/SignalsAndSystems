package com.example.elektronika.ui.data.model

import androidx.annotation.DrawableRes
import com.example.elektronika.ui.data.repository.Category

data class Section(
    val id: Int,
    val title: String,
    @DrawableRes val image: Int,
    val category: Category
)
