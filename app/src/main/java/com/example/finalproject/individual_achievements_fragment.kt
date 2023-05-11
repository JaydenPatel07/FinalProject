package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.finalproject.databinding.FragmentAchievementsBinding
import com.example.finalproject.databinding.FragmentIndividualAchievementsFragmentBinding

class individual_achievements_fragment : Fragment() {


    var team_or_individual = ""
    private var _binding: FragmentIndividualAchievementsFragmentBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding=FragmentIndividualAchievementsFragmentBinding.inflate(inflater,container, false)
        val rootView = binding.root
        val spinnerAdapter = ArrayAdapter.createFromResource(requireActivity(), R.array.year_array, android.R.layout.simple_spinner_item)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinner.adapter = spinnerAdapter

        binding.spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {


            override fun onItemSelected(adapterView: AdapterView<*>, childView: View?, position: Int, itemId: Long) {
                team_or_individual = adapterView.getItemAtPosition(position).toString()

                if (team_or_individual == "2022 Team Achievements") {

                }


            }
            override fun onNothingSelected(adapterView: AdapterView<*>?) {

            }
        }
        return rootView
    }

}