package com.rhuertas.flowlayout

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource

import flowlayout.shared.generated.resources.Res
import flowlayout.shared.generated.resources.compose_multiplatform

@Composable
@Preview
fun App(


) {
    MaterialTheme {
        var showContent by remember { mutableStateOf(true) }
        FlowColumn(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .fillMaxSize()
                .safeContentPadding()
                //.fillMaxSize(1.0f)
            ,
            horizontalArrangement = Arrangement.Center,
            verticalArrangement = Arrangement.Bottom,
            itemHorizontalAlignment = Alignment.End,
            //maxItemsInEachColumn = 2,
        ) {
            FlowRow (
                //itemVerticalAlignment = Alignment.CenterVertically,
                maxItemsInEachRow = 3,
                //modifier = Modifier.weight(0.2f),
            ){
                for (i in 0..<5) {
                    Text(
                        text = "Item $i",
                        textAlign = TextAlign.Center,
                    )
                }
                Button(
                    onClick = {
                        showContent = !showContent
                    },
                ) {
                    Text("Click me!")
                }
            }
            Image(
                painterResource(Res.drawable.compose_multiplatform),
                contentDescription = "mainview",
                //Modifier.weight(1.0f, fill = true),
                modifier = Modifier.fillMaxWidth(1.0f)
                //.weight(1.0f)
                //modifier = Modifier.height(900.dp),
                //contentScale = ContentScale.Fit,
            )

        }
    }
}