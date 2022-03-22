package com.nicolas.bahamut.to_docompose.ui.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.nicolas.bahamut.to_docompose.R
import com.nicolas.bahamut.to_docompose.ui.theme.LOGO_HEIGHT
import com.nicolas.bahamut.to_docompose.ui.theme.ToDoComposeTheme
import com.nicolas.bahamut.to_docompose.ui.theme.splashScreenBackground
import com.nicolas.bahamut.to_docompose.util.Constants.SPLASH_SCREEN_DELAY
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navigateToListScreen: () -> Unit
) {
    LaunchedEffect(key1 = true) {
        delay(SPLASH_SCREEN_DELAY)
        navigateToListScreen()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.splashScreenBackground),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier.size(LOGO_HEIGHT),
            painter = painterResource(id = getLogo()),
            contentDescription = stringResource(id = R.string.to_do_logo)
        )
    }
}

@Composable
fun getLogo(): Int {
    return if (isSystemInDarkTheme()) {
        R.drawable.ic_logo_dark
    } else {
        R.drawable.ic_logo_light
    }
}

@Composable
@Preview
fun SplashScreenPreview() {
    SplashScreen(
        navigateToListScreen = {}
    )
}

@Composable
@Preview
fun SplashScreenPreviewDarkTheme() {
    ToDoComposeTheme(darkTheme = true) {
        SplashScreen(
            navigateToListScreen = {}
        )
    }
}