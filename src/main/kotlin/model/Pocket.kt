package model

import buyList
import clientsList
import gamesList

class Pocket(
    val clientName: String
){
    private var viewingGame: Game? = null

    fun findGame(name: String) {
        viewingGame = gamesList.find { it.name == name }
    }

    fun findGameOnGenre(genre: Genre) {
        for(i in 0..gamesList.size)
            if (gamesList[i].genre == genre)
                viewingGame=gamesList[i]
    }

    fun addGameToPocket(game: Game){
        buyList.plus(game)
    }

    fun deleteGameFromPocket(game: Game){
        for (i in 0..buyList.size)
            if (buyList[i] == game)
                buyList.minus(i)
    }

    fun buy(clientName: String){
        for (i in 0..clientsList.size)
            if (clientsList[i].name==clientName)
                clientsList[i].library.plus(buyList)
    }

    fun cleanAll() {
        for (i in buyList.size..0)
            buyList.minus(i)
    }
}