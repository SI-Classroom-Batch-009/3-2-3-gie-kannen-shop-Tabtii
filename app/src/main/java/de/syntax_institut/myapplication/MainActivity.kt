package de.syntax_institut.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.syntax_institut.myapplication.adapter.ItemAdapter
import de.syntax_institut.myapplication.data.ItemDataSource
import de.syntax_institut.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Liste aus Filmtiteln wird von der Datasource geladen
        val pokeTitles = ItemDataSource().loadData()
        val pokeAdapter = ItemAdapter(this, pokeTitles)

        // recyclerView von Layout wird mit code verknüpft
        binding.pokeRV.adapter = pokeAdapter

    }
}