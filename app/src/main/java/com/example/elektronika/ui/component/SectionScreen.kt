package com.example.elektronika.ui.component

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.elektronika.R
import com.example.elektronika.ui.data.BookRepository
import com.example.elektronika.ui.data.Category
import com.example.elektronika.ui.data.Section

@Composable
fun SectionScreen(section: Section) {

    val title = when(section.category){
        Category.LECTURE -> stringResource(R.string.lectures)
        Category.PRACTICAL -> stringResource(R.string.practicals)
    }

    val books = when(section.category){
        Category.LECTURE -> BookRepository.getLectures()
        Category.PRACTICAL -> BookRepository.getPracticals()
    }

    LazyColumn(){
        items(books){book ->
            ItemBook(book = book) {
                //Open asset
            }
        }
    }



}