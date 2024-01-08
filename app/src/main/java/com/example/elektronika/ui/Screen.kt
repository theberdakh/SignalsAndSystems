package com.example.elektronika.ui

import androidx.annotation.RawRes


const val SECTION_ARGUMENT_KEY = "categoryId"
const val SECTION_NAME = "sectionName"
const val BOOKS = "size"
const val ASSET_ID = "assetId"
const val NO_ASSET = 0

sealed class Screen(val route: String){
    object Home: Screen("home_screen")
    object Section: Screen("section_screen/{$SECTION_NAME}/{$BOOKS}"){ //if optional "section_screen?sectionName={sectionName}&size={size}"

        //multiple args
        fun sendSectionNameAndBooks(
            sectionName: String,
            size: Int
        ) = "section_screen/$sectionName/$size" //if optional "section_screen?sectionName=$sectionName&size=$size


/*
        //one argument
        fun passId(categoryId: Int): String {
            return this.route.replace(
                oldValue = "{$SECTION_ARGUMENT_KEY}",
                newValue = categoryId.toString()
            )  //"section_screen/$categoryId"
        }
*/

    }
    object PDFScreen : Screen("pdf_screen/{$ASSET_ID}") {
        fun sendAsset(@RawRes assetId: Int) = "pdf_screen/$assetId"
    }

}
