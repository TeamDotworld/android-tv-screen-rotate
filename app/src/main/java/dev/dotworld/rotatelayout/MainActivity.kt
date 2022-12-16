package dev.dotworld.rotatelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.dotworld.rotatelayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // programmatically changing the device orientation
        //binding.rotateLayout.angle = 90 /*values must be 0 or 90 or 180 or 270*/

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}