package com.example.elektronika.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.elektronika.R
import com.example.elektronika.ui.Screen
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