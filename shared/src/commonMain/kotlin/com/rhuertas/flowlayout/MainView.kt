package com.rhuertas.flowlayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import flowlayout.shared.generated.resources.Res
import flowlayout.shared.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource
import androidx.compose.ui.graphics.Color

@Composable
@Preview
fun MainView(
    modifier : Modifier = Modifier,
) {

    Image(
        painterResource(Res.drawable.compose_multiplatform),
        contentDescription = "mainview",
        contentScale = ContentScale.Fit,
        modifier = modifier,

    )
}