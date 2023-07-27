package de.syntax_institut.myapplication.data

import de.syntax_institut.myapplication.R

class ItemDataSource {

    fun loadData(): List<ItemData> {
        return listOf(
            ItemData(R.string.poke_001, R.drawable._01, R.string.pokeText_001),
            ItemData(R.string.poke_002, R.drawable._02, R.string.pokeText_002),
            ItemData(R.string.poke_003, R.drawable._03, R.string.pokeText_003),
            ItemData(R.string.poke_004, R.drawable._04, R.string.pokeText_004),
            ItemData(R.string.poke_005, R.drawable._05, R.string.pokeText_005),
            ItemData(R.string.poke_006, R.drawable._06, R.string.pokeText_006),
            ItemData(R.string.poke_007, R.drawable._07, R.string.pokeText_007),
            ItemData(R.string.poke_008, R.drawable._08, R.string.pokeText_008),
            ItemData(R.string.poke_009, R.drawable._09, R.string.pokeText_009),

            )
    }


}