package com.example.elektronika.ui.navigation

import androidx.annotation.RawRes


const val CATEGORY_NAME = "category"
const val NO_CATEGORY ="no category defined"
const val BOOKS = "size"
const val ASSET_ID = "assetId"
const val NO_ASSET = 0
const val URL = "url"

const val LECTURES = "lectures"
const val PRACTICALS = "practicals"
const val VIDEOS = "videos"
const val EXAM = "exam"
const val DOCUMENTS = "documents"
sealed class Screen(val route: String){
    object Home: Screen("home_screen")
    object Section: Screen("section_screen/{$CATEGORY_NAME}"){ //if optional "section_screen?sectionName={sectionName}&size={size}"

        fun sendSectionNameAndBooks(
            categoryName: String
        ) = "section_screen/$categoryName" //if optional "section_screen?sectionName=$sectionName&size=$size


    }
    object PDFScreen : Screen("pdf_screen/{$ASSET_ID}") {
        fun sendAsset(@RawRes assetId: Int) = "pdf_screen/$assetId"
    }


    object VideoScreen: Screen("video_screen/{$URL}"){
        fun sendUrl(url: String) = "video_screen/$url"
    }

}
