package com.example.elektronika.ui.data

import com.example.elektronika.R

object BookRepository {
    fun getLectures() =
        listOf(
            Book(id = 1,
                title = "SIGNALLAR VA TIZIMLAR HAQIDA UMUMIY TUSHUNCHA",
                assetId = R.raw.lecture1
            ),
            Book(id = 2,
                title = "UZLUKSIZ SIGNALLARNING MATEMATIK IFODALARI",
                assetId = R.raw.lecture23)

        )
}