package com.example.elektronika.ui.component.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.elektronika.ui.Screen
import com.example.elektronika.ui.component.ItemBook
import com.example.elektronika.ui.data.BookRepository


@Composable
fun SectionScreen(navController: NavHostController) {



/*
    val books = when(section.category){
        Category.LECTURE -> BookRepository.getLectures()
        Category.PRACTICAL -> BookRepository.getPracticals()
    }
    val title = when(section.category){
        Category.LECTURE -> stringResource(R.string.lectures)
        Category.PRACTICAL -> stringResource(R.string.practicals)
    }*/

    Column {


        LazyColumn(){
            items(BookRepository.getLectures()){book ->
                ItemBook(book = book) {
                    navController.navigate(Screen.PDFScreen.sendAsset(book.assetId))
                }
            }
        }

    }


}