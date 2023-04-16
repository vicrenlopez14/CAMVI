package com.example.camvi.administradores.views.widgets

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.administradores.views.widgets.AdministradoresMenuScreen

@Composable
fun DrawerHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 64.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Camvi", fontSize = 60.sp)
    }
}

@Composable
fun DrawerBody(
    items: List<AdministradoresMenuScreen>,
    modifier: Modifier = Modifier,
    itemTextStyle: TextStyle = TextStyle(fontSize = 18.sp),
    onItemClick: (AdministradoresMenuScreen) -> Unit
) {
    LazyColumn(modifier) {
        items(items) { item ->
            Row(modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    onItemClick(item)
                }
                .padding(16.dp)) {
                Icon(
                    imageVector = item.icon, contentDescription = item.contentDescription
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = item.title, modifier = Modifier.weight(1f), style = itemTextStyle
                )
            }
        }
    }
}