package ua.edu.lntu.ipz_32_cw_4.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun SecondScreen(modifier: Modifier = Modifier, navController: NavController) {
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = "додаткове завдання за певним завданням.",
            fontSize = 20.sp,
        )
        Button(
            onClick = { /* Дії, які відбудуться при кліку на кнопку */ },
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            content = {
                Icon(Icons.Filled.Done, contentDescription = "Done", tint = Color.Black)
            }
        )
    }
}
