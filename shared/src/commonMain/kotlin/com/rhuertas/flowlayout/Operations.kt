package com.rhuertas.flowlayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import flowlayout.shared.generated.resources.Res
import flowlayout.shared.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
@Composable
@Preview
fun Operations(
    modifier : Modifier = Modifier,
)
{

    FlowRow(
        maxItemsInEachRow = 3,
        modifier = modifier,
        itemVerticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        verticalArrangement = Arrangement.Center,
    ) {
        for (i in 0..<5) {
            Text(
                text = "Item $i",
                textAlign = TextAlign.Center,
            )
        }
        Button(
            onClick = {},
            //modifier = Modifier.minimumInteractiveComponentSize(),
        ) {
            Text(
                "Test Button",
                textAlign = TextAlign.Center,
            )
        }
    }
}

