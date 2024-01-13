package com.example.elektronika.ui.component.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.elektronika.R
import com.example.elektronika.ui.data.model.Video
import com.example.elektronika.ui.data.repository.VideoRepository

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ItemVideo(
    video: Video,
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
        Row(
            modifier = Modifier
                .wrapContentHeight()
                .padding(16.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.video_lecture),
                contentDescription = "Image of book",
                modifier = Modifier
                    .wrapContentHeight()
                    .width(100.dp)
            )
            Text(
                text = video.title,
                modifier = Modifier
                    .padding(
                        start = 16.dp,
                        end = 16.dp,
                        top = 4.dp,
                        bottom = 16.dp
                    )
                    .fillMaxWidth(),
                style = MaterialTheme.typography.body1,
                textAlign = TextAlign.Start,
                maxLines = 4,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ItemVideoPreview() {
    ItemVideo(video = VideoRepository.getSystemsAndSignalsVideos()[0]) {

    }
}