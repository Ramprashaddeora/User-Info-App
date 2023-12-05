package com.example.userinfo.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCompositionContext
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.userinfo.components.HomePage
import com.example.userinfo.components.LangPage

@Composable
fun Nevigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(Screen.HomeScreen.route) {
            HomePage(navController)
        }
        composable(
            route = Screen.LangPage.route + "/{name}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                    defaultValue = "Subject"
                }
            )) { entry ->
            entry.arguments?.getString("name")?.let { LangPage(navController, name = it) }
        }
    }
}

