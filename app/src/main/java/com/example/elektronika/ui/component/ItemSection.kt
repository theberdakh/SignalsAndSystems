package com.example.elektronika.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.elektronika.R
import com.example.elektronika.ui.data.BookRepository
import com.example.elektronika.ui.data.Category
import com.example.elektronika.ui.data.Section
import com.example.elektronika.ui.theme.ElektronikaTheme
import com.example.elektronika.ui.theme.Typography

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ItemSection(
    section: Section,
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
                painter = painterResource(id = section.image),
                contentDescription = "Image of section ${section.title}",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)

            )
            Text(
                text = section.title,
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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewItemSection() {
    ElektronikaTheme {
        ItemSection( Section(1, "Lekciyalar", R.drawable.lecturer, Category.LECTURE)) {

        }
    }
}