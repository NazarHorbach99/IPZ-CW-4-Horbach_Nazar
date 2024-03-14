package ua.edu.lntu.ipz_32_cw_4.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.ui.tooling.preview.Preview
import ua.edu.lntu.ipz_32_cw_4.ui.theme.IPZ_32_cw_4Theme
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ua.edu.lntu.ipz_32_cw_4.Screen

@Composable
fun StartScreen(modifier: Modifier = Modifier, navController: NavController)
{
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = "Список завдань",
            fontSize = 35.sp,
        )

        Text(
            text = "Завдання 1",
            modifier = Modifier.clickable {
                navController.navigate(Screen.SecondScreen.route)
            }.padding(vertical = 8.dp), // Додаємо вертикальний відступ 8 dp
            fontSize = 20.sp
        )
        Text(
            text = "Завдання 2",
            modifier = Modifier.clickable {
                navController.navigate(Screen.SecondScreen.route)
            }.padding(vertical = 8.dp), // Додаємо вертикальний відступ 8 dp
            fontSize = 20.sp
        )
        Text(
            text = "Завдання 3",
            modifier = Modifier.clickable {
                navController.navigate(Screen.SecondScreen.route)
            }.padding(vertical = 8.dp), // Додаємо вертикальний відступ 8 dp
            fontSize = 20.sp
        )
        Text(
            text = "Завдання 4",
            modifier = Modifier.clickable {
                navController.navigate(Screen.SecondScreen.route)
            }.padding(vertical = 8.dp), // Додаємо вертикальний відступ 8 dp
            fontSize = 20.sp
        )
        Text(
            text = "Завдання 5",
            modifier = Modifier.clickable {
                navController.navigate(Screen.SecondScreen.route)
            }.padding(vertical = 8.dp), // Додаємо вертикальний відступ 8 dp
            fontSize = 20.sp
        )

    }
        }

