package com.example.elektronika.ui.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.elektronika.R
import com.example.elektronika.ui.component.screen.HomeScreen
import com.example.elektronika.ui.component.screen.PDFScreen
import com.example.elektronika.ui.component.screen.SectionScreen
import com.example.elektronika.ui.component.screen.VideoScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {

        composable(route = Screen.Home.route){
            HomeScreen(navController)
        }
        composable(
            route = Screen.Section.route,
            arguments = listOf(
              navArgument(CATEGORY_NAME){
                  type = NavType.StringType
              }//add defaultValue for optional
            )
        ){
            Log.d("Nav", it.arguments?.getString(CATEGORY_NAME).toString())

            val categoryName = it.arguments?.getString(CATEGORY_NAME) ?: NO_CATEGORY

            SectionScreen(navController, categoryName)
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

        composable(
            route = Screen.VideoScreen.route,
            arguments = listOf(
                navArgument(URL){
                    type = NavType.StringType
                }
            )
        ){
            val url = it.arguments?.getString(URL) ?: stringResource(R.string.null_video_adress)
            Log.d("url", "url: $url")
            VideoScreen(url = url)
        }


    }

}