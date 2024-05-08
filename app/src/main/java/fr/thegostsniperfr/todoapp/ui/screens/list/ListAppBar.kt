package fr.thegostsniperfr.todoapp.ui.screens.list

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ListAppbar() {
    DefaultListAppBar()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultListAppBar() {
    TopAppBar(
        colors = topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        title = {
            Text(
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onPrimary,
                text = "Tasks"
            )
        },
    )
}

@Preview
@Composable
private fun DefaultListAppBarPreview() {
    DefaultListAppBar()
}