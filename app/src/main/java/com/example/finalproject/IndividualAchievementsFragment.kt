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

class IndividualAchievementsFragment : Fragment() {


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


        val players = listOf(
            Player("Jack Cowgill", "Jack Cowgill:\\nAll Region Team, League All Star, NEPA All Star, UNICO Senior All Star Most Clean Sheets in League", "Senior", R.drawable.vector_asset),
            Player("Byron Maldonado", "All Region Team, League All Star, NEPA All Star", R.drawable.vector_asset),
            Player("Jayden Patel", "NEPA All Star, UNICO Senior All Star Top 5 League Assists","Senior", R.drawable.vector_asset),
            Player("Robert Saunders", "PA All State, All Region Team, League Player of the Year, League All Star, NEPA All Star, Top 5 in League Assists, Top 5 in League Goals","Senior", R.drawable.vector_asset),
            Player("Niko Williams", "League All Star, NEPA All Star","Senior", R.drawable.vector_asset),
            Player("Kohen Stiles", "All Region Team, League All Star, NEPA All Star, League Leader in Goals", "Junior", R.drawable.vector_asset),
            Player("Philip Sykes", "League All Star, NEPA All Star", "Junior", R.drawable.vector_asset),
            Player("Michael Maldonado", "League All Star, NEPA All Star", "Sophomore", R.drawable.vector_asset),

        )


        val myAdapter = PlayerAdapter(players)
        binding.recyclerView.adapter = myAdapter

        return rootView
    }

}