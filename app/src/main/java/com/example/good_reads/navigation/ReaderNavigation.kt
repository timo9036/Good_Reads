package com.example.good_reads.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.example.good_reads.screens.ReaderSplashScreen
import com.example.good_reads.screens.home.Home
import com.example.good_reads.screens.login.ReaderLoginScreen
import com.example.good_reads.screens.search.BooksSearchViewModel
import com.example.good_reads.screens.search.SearchScreen
import com.example.good_reads.screens.stats.ReaderStatsScreen

@Composable
fun ReaderNavigation() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = ReaderScreens.SplashScreen.name){

        composable(ReaderScreens.SplashScreen.name){
            ReaderSplashScreen(navController = navController)
        }
        composable(ReaderScreens.LoginScreen.name) {
            ReaderLoginScreen(navController = navController)
        }
        composable(ReaderScreens.ReaderStatsScreen.name) {
            ReaderStatsScreen(navController = navController)
        }
        composable(ReaderScreens.ReaderHomeScreen.name){
            Home(navController = navController)
        }
        composable(ReaderScreens.SearchScreen.name){
            val viewModel = hiltViewModel<BooksSearchViewModel>()
            SearchScreen(navController = navController, viewModel)
        }
    }
}