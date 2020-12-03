package model

import clientsList
import gameStudiosList
import gamesList
import genres
import persons

class Store () {

    fun addClientByName(name: String){
        persons[name]?.let {
            if (it is Client)
                clientsList.add(it)
        }
    }

    fun addGameStudioByName(name: String){
        persons[name]?.let {
            if (it is GameStudios)
                gameStudiosList.add(it)
        }
    }

    fun addGenre(genre: Genre){
        val newGenre = genres.find {it.name == genre.name}
        if(newGenre != null) {
            print("Such genre already exists")
        }
        else
            genres += genre
    }

    fun addGame(game: Game){
        val newGame = gamesList.find {it.name == game.name}
        if(newGame != null) {
            print("Such game already exists")
        }
        else
            gamesList += game
    }


}