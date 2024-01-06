package com.example.elektronika.ui

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.*
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.elektronika.ui.component.HomeScreen
import com.example.elektronika.ui.component.SectionScreen
import com.example.elektronika.ui.data.Section

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


    }

}