package com.example.elektronika.ui.data

import com.example.elektronika.R

object SectionRepository {

    fun getHomeSections() = listOf(
        Section(1, "Lekciyalar", R.drawable.lecturer, Category.LECTURE),
        Section(2, "Ámeliyler", R.drawable.physics, Category.PRACTICAL)
    )
}