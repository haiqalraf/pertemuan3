package com.ravesian.pertemuan3

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.ravesian.pertemuan3.databinding.ActivityMainBinding
import splitties.activities.start

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        showRecycleList()
    }

    private fun showRecycleList(){
        with(activityMainBinding){
            rvCharacter.setHasFixedSize(true)
            rvCharacter.layoutManager = LinearLayoutManager(this@MainActivity)
            val characterAdapter = CharacterAdapter(DummyCharacter.getAll(), this@MainActivity)
            rvCharacter.adapter = characterAdapter

            characterAdapter.setOnItemClickCallback(object : CharacterAdapter.OnItemClickCallback {
                override fun onItemClicked(data: Character, context: Context) {
                    showSelectedCharacter(data, context)
                }
            })
        }
    }

    private fun showSelectedCharacter(data: Character, context: Context) {
        val intent = Intent(context,DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_CHARACTER, data)
        startActivity(intent)
    }
}