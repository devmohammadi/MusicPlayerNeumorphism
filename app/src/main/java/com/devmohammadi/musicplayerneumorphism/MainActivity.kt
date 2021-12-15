package com.devmohammadi.musicplayerneumorphism

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.view.animation.RotateAnimation
import com.devmohammadi.musicplayerneumorphism.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var rotate = RotateAnimation(
            0f,
            360f,
            Animation.RELATIVE_TO_SELF,
            0.5f,
            Animation.RELATIVE_TO_SELF,
            0.5f
        )

        rotate.duration = 15000
        rotate.interpolator = LinearInterpolator()
        rotate.repeatCount = Animation.INFINITE

        binding.musicPageCoverImg.startAnimation(rotate)

    }
}