package com.example.elektronika.ui.data

import com.example.elektronika.R

object BookRepository {




    fun getLectures() =
        listOf(
            Book(
                id = 1,
                title = "SIGNALLAR VA TIZIMLAR HAQIDA UMUMIY TUSHUNCHA",
                assetId = R.raw.lecture_1,
                section = Category.LECTURE
            ),
            Book(
                id = 2,
                title = "UZLUKSIZ SIGNALLARNING MATEMATIK IFODALARI",
                assetId = R.raw.lecture_2_3,
                section = Category.LECTURE)

        )

    fun getPracticals() =
        listOf<Book>()
}

enum class Category(){
    LECTURE, PRACTICAL
}