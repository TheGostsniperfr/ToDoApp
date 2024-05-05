package fr.thegostsniperfr.todoapp.data.models

import androidx.compose.ui.graphics.Color
import fr.thegostsniperfr.todoapp.ui.theme.HighPriorityColor
import fr.thegostsniperfr.todoapp.ui.theme.LowPriorityColor
import fr.thegostsniperfr.todoapp.ui.theme.MediumPriorityColor
import fr.thegostsniperfr.todoapp.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}