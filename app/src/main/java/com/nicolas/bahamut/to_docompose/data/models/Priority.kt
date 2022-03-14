package com.nicolas.bahamut.to_docompose.data.models

import androidx.compose.ui.graphics.Color
import com.nicolas.bahamut.to_docompose.ui.theme.HighPriorityColor
import com.nicolas.bahamut.to_docompose.ui.theme.LowPriorityColor
import com.nicolas.bahamut.to_docompose.ui.theme.MediumPriorityColor
import com.nicolas.bahamut.to_docompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}