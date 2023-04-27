package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val rootView = binding.root

        binding.announcementsButton.setOnClickListener {
        rootView.findNavController().navigate(R.id.action_mainFragment_to_announcementsFragment)
    }
        binding.acheivementsButton.setOnClickListener {
            rootView.findNavController().navigate(R.id.action_mainFragment_to_achievementsFragment)
        }
        binding.rosterButton.setOnClickListener {
            rootView.findNavController().navigate(R.id.action_mainFragment_to_rosterFragment)
        }
        binding.scheduleButton.setOnClickListener {
            rootView.findNavController().navigate(R.id.action_mainFragment_to_scheduleFragment)
        }

return rootView

    }



}