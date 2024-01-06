package com.example.elektronika.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.example.elektronika.BouquetViewModel
import com.example.elektronika.R
import com.example.elektronika.ui.Screen
import com.example.elektronika.ui.data.BookRepository
import com.example.elektronika.ui.data.Category
import com.example.elektronika.ui.data.Section


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
                    //Open asset
                }
            }
        }

    }


}