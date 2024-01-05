package com.example.elektronika.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.elektronika.R
import com.example.elektronika.ui.data.Book
import com.example.elektronika.ui.data.Section

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ItemBook(
    book: Book,
    onClick: () -> Unit
) {

    Card(
        onClick = onClick,
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .wrapContentSize()
            .padding(16.dp),
        backgroundColor = MaterialTheme.colors.surface,
        elevation = 4.dp
    ) {
        Column(modifier = Modifier.wrapContentHeight()){
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Image of book",
                modifier = Modifier.fillMaxWidth())
            Text(
                text = book.title,
                modifier = Modifier
                    .padding(
                        start = 16.dp,
                        end = 16.dp,
                        top = 4.dp,
                        bottom = 16.dp)
                    .fillMaxWidth(),
                style = MaterialTheme.typography.body1,
                textAlign = TextAlign.Center)

        }
    }
}