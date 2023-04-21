package com.technolyst.drawer.pages.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.technolyst.drawer.R

@OptIn(ExperimentalUnitApi::class)
@Composable
fun DrawerHeader() {

    Column(
        modifier = Modifier
            .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.pic_profile),
            contentDescription = "profile pic",
            modifier = Modifier
                .clip(CircleShape)
                .width(150.dp)
                .border(width = 2.dp, color = Color.Gray, shape = CircleShape)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Prashant Developer", fontSize = TextUnit(18F, TextUnitType.Sp), color = Color.Black,)
        Spacer(modifier = Modifier.height(2.dp))
        Text(text = "xyz@gmail.com", fontSize = TextUnit(14F, TextUnitType.Sp), color = Color.Gray)




    }

}