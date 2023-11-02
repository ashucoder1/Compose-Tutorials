package com.example.composeapp

import android.view.View.OnClickListener
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExpandableCard(
    title:String,
    titleFontSize: TextUnit =MaterialTheme.typography.headlineMedium.fontSize,
    titleFontWeight:FontWeight=FontWeight.Bold,
    description:String,
    descriptionFontSize:TextUnit=MaterialTheme.typography.bodyMedium.fontSize,
    descriptionFontWeight :FontWeight=FontWeight.Medium,
    shape:CornerBasedShape=AbsoluteRoundedCornerShape(4.dp)

){
    var expandedState by remember { mutableStateOf (false) }
    val rotationState by animateFloatAsState(targetValue = if (expandedState) 180f else 0f)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 300,
                    easing = LinearOutSlowInEasing
                )
            ),
        shape = shape,
        onClick={
            expandedState=!expandedState
        }
    ) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(modifier = Modifier
                .weight(6f),
                text = title,
                fontWeight = titleFontWeight,
                fontSize = titleFontSize,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
                )
            IconButton(
                modifier = Modifier
                    .alpha(2f)
                    .weight(1f)
                    .rotate(rotationState),
                onClick = {
                    expandedState=!expandedState
                }) {
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = "Drop-Down Arrow"
                )
            }
        }
        if (expandedState){
            Text(text = description,
                fontSize = descriptionFontSize,
                maxLines = 4,
                fontWeight=descriptionFontWeight,
                overflow = TextOverflow.Ellipsis
            )

        }

    }
    }
}
@ExperimentalMaterial3Api
@Composable
@Preview
fun ExpandableCardPreview(){
    ExpandableCard(title="MY Final Title",
        description = "sdfdsdffdfffsdfs" +
            "sdfsdfsfdfdsdffsfdsdfsd" +
            "sfsdfdfdfsdfdsfdfdsfdsdf" +
            "sdfdffsffjhhjjmhhjmmhmhm"
     )
}