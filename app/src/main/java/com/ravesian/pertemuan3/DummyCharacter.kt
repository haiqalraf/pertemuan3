package com.ravesian.pertemuan3

object DummyCharacter {
    val spongebob = Character("https://upload.wikimedia.org/wikipedia/en/thumb/3/3b/SpongeBob_SquarePants_character.svg/330px-SpongeBob_SquarePants_character.svg.png", "Spongebob", 22)
    val patrick = Character("https://static.wikia.nocookie.net/nickelodeon-movies/images/7/7e/Patrick_Star.png/revision/latest?cb=20180107193038", "Patrick", 23)
    val sandy = Character("https://upload.wikimedia.org/wikipedia/en/thumb/a/a0/Sandy_Cheeks.svg/1200px-Sandy_Cheeks.svg.png", "Sandy", 24)
    val squidward = Character("https://upload.wikimedia.org/wikipedia/en/thumb/8/8f/Squidward_Tentacles.svg/1200px-Squidward_Tentacles.svg.png", "Squidward", 25)
    val krabs = Character("https://upload.wikimedia.org/wikipedia/en/thumb/f/f8/Mr._Krabs.svg/1200px-Mr._Krabs.svg.png", "Mr. Crabs", 40)
    val garry = Character("https://static.wikia.nocookie.net/spongebob/images/9/9e/Gary_looking_up_stock_art.png/revision/latest?cb=20181227162221", "Garry", 12)
    val plankton = Character("https://static.wikia.nocookie.net/spongebob-new-fanon/images/2/29/Flat%2C1000x1000%2C075%2Cf.u5.jpg/revision/latest/top-crop/width/360/height/450?cb=20200406024141", "Plankton", 41)
    val puff = Character("https://upload.wikimedia.org/wikipedia/en/thumb/c/ce/Mrs._Puff.svg/1200px-Mrs._Puff.svg.png", "Ms. Puff", 38)
    val larry = Character("https://i.pinimg.com/736x/7c/dc/9b/7cdc9b9ee9762ab149340371c6e25827.jpg", "Larry The Lobster", 28)
    val mermaidman = Character("https://static.wikia.nocookie.net/spongebob/images/b/bf/Current_Mermaid_Man_stock_art.png/revision/latest?cb=20191008043711", "Mermaid Man", 46)

    fun getAll(): MutableList<Character> {
        val list = mutableListOf<Character>()
        list.add(spongebob)
        list.add(patrick)
        list.add(sandy)
        list.add(squidward)
        list.add(krabs)
        list.add(garry)
        list.add(puff)
        list.add(plankton)
        list.add(larry)
        list.add(mermaidman)

        return list
    }


}