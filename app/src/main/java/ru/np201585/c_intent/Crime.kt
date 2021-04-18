package ru.np201585.c_intent

import java.util.*

data class Crime (val id: UUID = UUID.randomUUID(),
                var title:String = "",
                var date: Date = Date(),
                var isSolved: Boolean = false)