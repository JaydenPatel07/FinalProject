package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
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
                    binding.achievements.text = "Robert Saunders:\nPA All State, All Region Team, League Player of the Year, League All Star, NEPA All Star, Top 5 in League Assists, Top 5 in League Goals, \nKohen Stiles:\nAll Region Team, League All Star, NEPA All Star, League Leader in Goals\nJack Cowgill:\nAll Region Team, League All Star, NEPA All Star, UNICO Senior All Star Most Clean Sheets in League\nByron Maldonado:\nAll Region Team, League All Star, NEPA All Star\nJayden Patel\nNEPA All Star, UNICO Senior All Star Top 5 League Assists\nNiko Williams:\nLeague All Star, NEPA All Star\n" + "Michael Maldonado:\n" + "League All Star, NEPA All Star\nPhilip Sykes:\nLeague All Star, NEPA All Star"
                }

            }
            override fun onNothingSelected(adapterView: AdapterView<*>?) {

            }
        }
        return rootView
    }





}