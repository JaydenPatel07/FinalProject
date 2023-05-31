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

        binding.contactsButton.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToContactsFragment()
            rootView.findNavController().navigate(action)
        }
        binding.acheivementsButton.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToAchievementsFragment()
            rootView.findNavController().navigate(action)
        }
        binding.rosterButton.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToRosterFragment()
            rootView.findNavController().navigate(action)
        }
        binding.scheduleButton.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToScheduleFragment()
            rootView.findNavController().navigate(action)
        }

return rootView

    }



}