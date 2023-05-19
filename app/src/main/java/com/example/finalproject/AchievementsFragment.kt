package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentAchievementsBinding

class AchievementsFragment : Fragment() {

    var team_or_individual = ""
    private var _binding: FragmentAchievementsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding=FragmentAchievementsBinding.inflate(inflater,container, false)
        val rootView = binding.root
        val spinnerAdapter = ArrayAdapter.createFromResource(requireActivity(), R.array.year_array, android.R.layout.simple_spinner_item)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinner.adapter = spinnerAdapter

        binding.spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {


            override fun onItemSelected(adapterView: AdapterView<*>, childView: View?, position: Int, itemId: Long) {
                team_or_individual = adapterView.getItemAtPosition(position).toString()

                if (team_or_individual == "2022 Team Achievements") {
                    binding.achievements.text = "District 2 AAAA Champions\nLackawanna League Division 1 Champions\n14-0 League Record\n18-2 Overall Record\n+52 Goal Differential\nAllowed 5 goals in 14 League Games\n10 Shutouts in 14 league games"

                }
                if (team_or_individual == "2022 Individual Achievements") {
                    val action = AchievementsFragmentDirections.actionAchievementsFragmentToIndividualAchievementsFragment()
                    rootView.findNavController().navigate(action)                }

            }
            override fun onNothingSelected(adapterView: AdapterView<*>?) {

            }
        }
        return rootView
    }





}