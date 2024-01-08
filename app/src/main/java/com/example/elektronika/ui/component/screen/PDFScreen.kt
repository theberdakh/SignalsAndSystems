package com.example.elektronika.ui.component.screen

import androidx.activity.viewModels
import androidx.annotation.RawRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.elektronika.BouquetViewModel
import com.example.elektronika.R
import com.theberdakh.bouquet.ResourceType
import com.theberdakh.bouquet.VerticalPDFReader
import com.theberdakh.bouquet.VerticalPdfReaderState

@Composable
fun PDFScreen(
    @RawRes assetId: Int
) {

    Box(
        contentAlignment = Alignment.TopStart
    ) {
        VerticalPDFReader(
            state = VerticalPdfReaderState(ResourceType.Asset(assetId)),
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Gray)
        )
      /*  Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            LinearProgressIndicator(
                progress = pdfState.loadPercent / 100f,
                color = Color.Red,
                backgroundColor = Color.Green,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row(modifier = Modifier.alpha(0f)) {
                Spacer(modifier = Modifier.width(16.dp))
                Column(
                    modifier = Modifier
                        .background(
                            color = MaterialTheme.colors.surface.copy(alpha = 0.5f),
                            shape = MaterialTheme.shapes.medium
                        ),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Page: ${pdfState.currentPage}/${pdfState.pdfPageCount}",
                        modifier = Modifier.padding(
                            start = 8.dp,
                            end = 8.dp,
                            bottom = 4.dp,
                            top = 8.dp
                        )
                    )
                    Text(
                        text = if (pdfState.isScrolling) {
                            "Scrolling"
                        } else {
                            "Stationary"
                        },
                        color = if (pdfState.isScrolling) {
                            MaterialTheme.colors.onSurface
                        } else {
                            MaterialTheme.colors.error
                        },
                        modifier = Modifier.padding(
                            start = 8.dp,
                            end = 8.dp,
                            bottom = 8.dp,
                            top = 4.dp
                        )
                    )
                }
            }
        }*/
      /*  LaunchedEffect(key1 = pdfState.error) {
            pdfState.error?.let {
                scaffoldState.snackbarHostState.showSnackbar(
                    message = it.message ?: "Error"
                )
            }
        }*/
    }
}