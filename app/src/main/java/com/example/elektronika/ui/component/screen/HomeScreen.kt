package com.example.elektronika.ui.component.screen

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.elektronika.ui.navigation.DOCUMENTS
import com.example.elektronika.ui.navigation.EXAM
import com.example.elektronika.ui.navigation.LECTURES
import com.example.elektronika.ui.navigation.NO_CATEGORY
import com.example.elektronika.ui.navigation.PRACTICALS
import com.example.elektronika.ui.navigation.Screen
import com.example.elektronika.ui.navigation.VIDEOS
import com.example.elektronika.ui.component.item.ItemSection
import com.example.elektronika.ui.data.repository.Category
import com.example.elektronika.ui.data.repository.SectionRepository

@Composable
fun HomeScreen(navController: NavHostController) {

    val sections = SectionRepository.getHomeSections()

    Column {

        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
        ){
            items(sections){section ->
                ItemSection(section = section) {

                    val categoryName = when(section.category){
                        Category.VIDEO -> VIDEOS
                        Category.LECTURE -> LECTURES
                        Category.DOCUMENTS -> DOCUMENTS
                        Category.EXAM -> EXAM
                        Category.PRACTICAL -> PRACTICALS
                    }
                    Log.d(this.javaClass.simpleName, categoryName)
                    navController.navigate(Screen.Section.sendSectionNameAndBooks(categoryName))
                }
            }
        }
    }



}