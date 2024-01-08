package com.example.elektronika.ui

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.elektronika.ui.component.screen.HomeScreen
import com.example.elektronika.ui.component.screen.PDFScreen
import com.example.elektronika.ui.component.screen.SectionScreen
import com.theberdakh.bouquet.ResourceType
import com.theberdakh.bouquet.VerticalPdfReaderState

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {


        composable(route = Screen.Home.route){
            HomeScreen(navController)
        }


        composable(
            route = Screen.Section.route,
            arguments = listOf(
                navArgument(SECTION_NAME){ type = NavType.StringType }, //add defaultValue for optional
                navArgument(BOOKS){ type = NavType.IntType } //add defaultValue for optional
            )
        ){
            Log.d("Nav", it.arguments?.getString(SECTION_NAME).toString())
            Log.d("Nav", it.arguments?.getInt(BOOKS).toString())
            SectionScreen(navController)
        }

        composable(
            route = Screen.PDFScreen.route,
            arguments = listOf(
                navArgument(ASSET_ID){ type = NavType.ReferenceType}
            )
        ){
            val assetId: Int = it.arguments?.getInt(ASSET_ID) ?: NO_ASSET
            Log.d(this.javaClass.name, "assetId: $assetId")

            PDFScreen(assetId = assetId)
        }


    }

}