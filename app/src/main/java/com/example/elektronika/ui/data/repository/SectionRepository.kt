package com.example.elektronika.ui.data.repository

import com.example.elektronika.R
import com.example.elektronika.ui.data.model.Section

object SectionRepository {

    fun getHomeSections() = listOf(
        Section(
            id = 1,
            title = "Lekciyalar",
            image = R.drawable.lecturer,
            category = Category.LECTURE
        ),
        Section(
            id = 2,
            title =  "Ámeliyler",
            image = R.drawable.physics,
            category = Category.PRACTICAL
        ),
        Section(
            id = 3,
            title = "Video sabaqlar",
            image = R.drawable.video_lecture,
            category = Category.VIDEO
        ),
        Section(
            id = 4,
            title = "Hújjetler",
            category = Category.DOCUMENTS,
            image = R.drawable.folder
        ),
        Section(
            id = 5,
            title = "Imtihan materialları",
            category = Category.EXAM,
            image = R.drawable.exam
        )
    )
}