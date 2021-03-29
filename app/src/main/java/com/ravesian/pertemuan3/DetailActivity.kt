package com.ravesian.pertemuan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import com.ravesian.pertemuan3.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var activityDetailBinding: ActivityDetailBinding

    companion object {
        const val EXTRA_CHARACTER = "extra_character"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityDetailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(activityDetailBinding.root)

        setDetailCharacter()
    }

    private fun setDetailCharacter() {
        val character = intent.getParcelableExtra<Character>(EXTRA_CHARACTER)
        with(activityDetailBinding){
            civProfile.load(character?.image)
            tvName.text = character?.name ?: "No Name"
            tvAge.text = character?.age.toString()
        }
    }
}