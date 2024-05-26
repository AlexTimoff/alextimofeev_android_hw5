package com.example.alextimofeev_android_hw5

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.alextimofeev_android_hw5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var gameSound: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val startButton: Button=binding.startGame
        gameSound=MediaPlayer.create(this,R.raw.right_answer)
        startButton.setOnClickListener {
            gameSound.start()
        }

    }
}