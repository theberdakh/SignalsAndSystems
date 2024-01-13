package com.example.elektronika.ui.component.screen

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.elektronika.ui.DOCUMENTS
import com.example.elektronika.ui.EXAM
import com.example.elektronika.ui.LECTURES
import com.example.elektronika.ui.PRACTICALS
import com.example.elektronika.ui.Screen
import com.example.elektronika.ui.VIDEOS
import com.example.elektronika.ui.component.item.ItemBook
import com.example.elektronika.ui.component.item.ItemVideo
import com.example.elektronika.ui.data.model.Book
import com.example.elektronika.ui.data.repository.BookRepository
import com.example.elektronika.ui.data.model.Video
import com.example.elektronika.ui.data.repository.VideoRepository


@Composable
fun SectionScreen(
    navController: NavHostController,
    category: String
) {

    val items = when(category){
        LECTURES -> BookRepository.getLectures()
        PRACTICALS -> BookRepository.getPracticals()
        VIDEOS -> VideoRepository.getSystemsAndSignalsVideos()
        DOCUMENTS -> BookRepository.getDocuments()
        EXAM -> BookRepository.getExamMaterials()
        else -> emptyList<Book>()
    }

    Log.d("SectionScreen", items.toString())



    Column {
        LazyColumn(){
            items(items){item ->
                when(item){
                    is Book -> ItemBook(book = item) {
                        navController.navigate(Screen.PDFScreen.sendAsset(item.assetId))
                    }
                    is Video -> ItemVideo(video = item){
                        navController.navigate(Screen.VideoScreen.sendUrl(item.url))
                    }
                }
            }
        }

    }


}