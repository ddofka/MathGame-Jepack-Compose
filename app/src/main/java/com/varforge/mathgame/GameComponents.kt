package com.varforge.mathgame

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextForQuestion(text : String){

    Text(
        text = text,
        fontSize = 24.sp,
        color = Color.White,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(color = colorResource(id = R.color.blue))
            .size(300.dp,75.dp)
            .wrapContentHeight()
    )

}

@Composable
fun TextFieldForAnswer(text : MutableState<String>){

    TextField(
        value = text.value,
        onValueChange = {text.value = it},
        label = {Text(text = "Enter you answer...")},
        colors = TextFieldDefaults.colors(
            focusedLabelColor = Color.White,
            unfocusedTextColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            unfocusedContainerColor = colorResource(id = R.color.blue),
            focusedContainerColor = colorResource(id = R.color.blue),
            focusedTextColor = Color.White,
            cursorColor = Color.White
        ),
        modifier = Modifier.size(300.dp,75.dp),
        textStyle = TextStyle(fontSize = 24.sp, textAlign = TextAlign.Center),
        shape = RoundedCornerShape(0),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )

}

@Composable
fun ButtonOkNext(buttonText : String, myOnClick:() -> Unit, isEnabled : Boolean){

    Button(
        onClick = myOnClick,
        enabled = isEnabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White
        ),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(2.dp, color = colorResource( id = R.color.blue)),
        modifier = Modifier.width(150.dp)
        ) {
        Text(text = buttonText, fontSize = 24.sp, color = colorResource(id = R.color.blue))
        }

}