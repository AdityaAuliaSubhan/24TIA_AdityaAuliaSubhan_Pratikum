package com.example.adityaauliasubhan_3tia.Tutorial

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.adityaauliasubhan_3tia.Home.pertemuan_5.LimaActivity
import com.example.adityaauliasubhan_3tia.LoginActivity
import com.example.adityaauliasubhan_3tia.R
import com.example.adityaauliasubhan_3tia.databinding.FragmentHomeBinding
import com.example.adityaauliasubhan_3tia.databinding.FragmentTutorial3Binding

class Tutorial3Fragment : Fragment() {

    private var _binding: FragmentTutorial3Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTutorial3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnlogin.setOnClickListener {
            val intent = Intent(requireContext(), LoginActivity::class.java)
            startActivity(intent)
        }
    }
}