package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentIndividualRecyclerViewBinding

class IndividualAchievementsFragment : Fragment() {
    private var _binding: FragmentIndividualRecyclerViewBinding? = null
    private val binding get() = _binding!!

        val players = listOf(
     Player("Jack Cowgill", "All Region Team\nLeague All Star\nNEPA All Star\nUNICO Senior All Star\nMost Clean Sheets in League", "Senior", R.drawable.jack),
        Player("Byron Maldonado", "All Region Team\nLeague All Star\nNEPA All Star","Senior", R.drawable.byron),
        Player("Jayden Patel", "NEPA All Star\nUNICO Senior All Star\nTop 5 League Assists","Senior", R.drawable.jayden),
       Player("Robert Saunders", "PA All State\nAll Region Team\nLeague Player of the Year\nLeague All Star\nNEPA All Star\nTop 5 in League Assists\nTop 5 in League Goals","Senior", R.drawable.robert),
      Player("Niko Williams", "League All Star\nNEPA All Star","Senior", R.drawable.niko),
        Player("Kohen Stiles", "All Region Team\nLeague All Star\nNEPA All Star\nLeague Leader in Goals", "Junior", R.drawable.kohen),
        Player("Philip Sykes", "League All Star\nNEPA All Star", "Junior", R.drawable.phil),
        Player("Michael Maldonado", "League All Star\nNEPA All Star", "Sophomore", R.drawable.mike)

   )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentIndividualRecyclerViewBinding.inflate(inflater, container, false)
        val rootView = binding.root


        val myAdapter = PlayerAdapter(players)
        binding.recyclerView.adapter = myAdapter

        return rootView
    }

}