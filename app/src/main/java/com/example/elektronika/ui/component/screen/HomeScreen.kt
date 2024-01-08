package com.example.elektronika.ui.component.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.elektronika.ui.Screen
import com.example.elektronika.ui.component.ItemSection
import com.example.elektronika.ui.data.SectionRepository

@Composable
fun HomeScreen(navController: NavHostController) {

    val sections = SectionRepository.getHomeSections()

    Column {


        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
        ){
            items(sections){section ->
                ItemSection(section = section) {
                    navController.navigate(Screen.Section.sendSectionNameAndBooks("Lectures", 10))
                }
            }
        }
    }



}