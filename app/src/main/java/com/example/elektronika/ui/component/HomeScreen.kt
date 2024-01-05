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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.elektronika.ui.data.SectionRepository

@Composable
fun HomeScreen() {

    val sections = SectionRepository.getHomeSections()

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
    ){
        items(sections){section ->
            ItemSection(section = section) {
                //Handle on Click here
            }
        }
    }

}