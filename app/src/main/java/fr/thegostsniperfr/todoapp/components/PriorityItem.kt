package fr.thegostsniperfr.todoapp.components

import androidx.annotation.Dimension
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import fr.thegostsniperfr.todoapp.data.models.Priority
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.thegostsniperfr.todoapp.ui.theme.LARGE_PADDING
import fr.thegostsniperfr.todoapp.ui.theme.PRIORITY_INDICATOR_SIZE
import fr.thegostsniperfr.todoapp.ui.theme.SMALL_PADDING

@Composable
fun PriorityItem(priority: Priority) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Canvas(
            modifier = Modifier
                .size(PRIORITY_INDICATOR_SIZE),
        ) {
            drawCircle(color = priority.color)
        }

        Text(
            modifier = Modifier
                .padding(start = LARGE_PADDING),
            text = priority.name,
            style = MaterialTheme.typography.titleSmall,
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}

@Composable
@Preview
fun PriorityItemPreview() {
    PriorityItem(priority = Priority.LOW)
}