package com.example.elektronika.ui


const val SECTION_ARGUMENT_KEY = "categoryId"
const val SECTION_NAME = "sectionName"
const val BOOKS = "size"

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

}
