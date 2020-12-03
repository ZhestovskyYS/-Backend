package model

import repo.Item

class Genre (
    override val name: String,
    val shortname: String
) : Item