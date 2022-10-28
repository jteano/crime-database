package com.example.crimedatabase

import java.util.*

class Crime {
    fun copy(toString: String): Crime {

    }

    data class Crime(
        val id: UUID,
        val title: String,
        val date: Date,
        val isSolved: Boolean
    )
}