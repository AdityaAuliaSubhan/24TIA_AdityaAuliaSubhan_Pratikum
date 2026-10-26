package com.example.adityaauliasubhan_3tia

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.adityaauliasubhan_3tia.Tutorial.Tutorial1Fragment
import com.example.adityaauliasubhan_3tia.Tutorial.Tutorial2Fragment
import com.example.adityaauliasubhan_3tia.Tutorial.Tutorial3Fragment
import com.example.adityaauliasubhan_3tia.Tutorial.TutorialFragmentAdapter
import com.example.adityaauliasubhan_3tia.databinding.ActivityLoginBinding
import com.example.adityaauliasubhan_3tia.databinding.ActivityTutorialScreenBinding

class TutorialScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTutorialScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityTutorialScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val fragmentsList = listOf(
            Tutorial1Fragment(), Tutorial2Fragment(), Tutorial3Fragment()
        )
        val adapter = TutorialFragmentAdapter(this, fragmentsList)
        binding.tutorialMessageViewPager.adapter = adapter


        binding.dotIndicator.attachTo(binding.tutorialMessageViewPager)
    }
}