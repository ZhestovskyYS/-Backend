package model

import repo.Item
import genres
import java.time.LocalDate

class Game(
    override val name: String,
    val shortName: String,
    val genre: Genre,
    val studioName: String,
    val description: String = "",
    val cost: Float
) : Item