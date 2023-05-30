package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentIndividualRecyclerViewBinding
import com.example.finalproject.databinding.FragmentScheduleBinding
import com.example.finalproject.databinding.ScheduleRecyclerViewBinding


class ScheduleFragment : Fragment() {

    private var _binding: ScheduleRecyclerViewBinding? = null
    private val binding get() = _binding!!
    val games = listOf(
        Game("8/31\nLeague", "4:15pm", "Honesdale", "Abington Heights", 1, 3, R.drawable.honesdale, R.drawable.ah_team_logo, true) ,
       Game("9/1\nNon Conference", "4:15pm", "Tunkhannock", "Abington Heights", 1, 5, R.drawable.tunkhannock, R.drawable.ah_team_logo, true),
        Game("9/7\nLeague", "4:15pm", "Abington Heights", "Valley View", 3, 0, R.drawable.ah_team_logo, R.drawable.valley_view, true),
        Game("9/12\nLeague", "6:00pm", "North Pocono", "Abington Heights", 1, 2, R.drawable.np_logo, R.drawable.ah_team_logo, true),
        Game("9/15\nLeague", "4:15pm", "Abington Heights", "Delaware Valley", 0, 3, R.drawable.ah_team_logo, R.drawable.del_val, true),
        Game("9/17\nNon Conference", "11:00am", "Abington Heights", "Dallas", 3, 1, R.drawable.ah_team_logo, R.drawable.dallas, true),
        Game("9/19\nLeague", "5:00pm", "Scranton Prep", "Abington Heights", 0, 5, R.drawable.prep, R.drawable.ah_team_logo, true),
        Game("9/22\nLeague", "4:15pm", "Wallenpaupack", "Abington Heights", 1, 2, R.drawable.paupack, R.drawable.ah_team_logo, true),
        Game("9/26\nLeague", "6:30pm", "Abington Heights", "Scranton", 10, 0, R.drawable.ah_team_logo, R.drawable.scranton, true),
        Game("9/29\nLeague", "4:15pm", "Abington Heights", "Honesdale", 6, 0, R.drawable.ah_team_logo, R.drawable.honesdale, true),
        Game("10/5\nLeague", "6:00pm", "Valley View", "Abington Heights", 1, 4, R.drawable.valley_view, R.drawable.ah_team_logo, true),
        Game("10/7\nLeague", "6:00pm", "Abington Heights", "North Pocono", 2, 0, R.drawable.ah_team_logo, R.drawable.np_logo, true),
        Game("10/8\nNon Conference", "10:00am", "Crestwood", "Abington Heights", 2, 1, R.drawable.crest, R.drawable.ah_team_logo, false),
        Game("10/12\nLeague", "6:00pm", "Delaware Valley", "Abington Heights", 0, 3, R.drawable.del_val, R.drawable.ah_team_logo, true),
        Game("10/14\nLeague", "6:30pm", "Abington Heights", "Scranton Prep", 1, 0, R.drawable.ah_team_logo, R.drawable.prep, true),
        Game("10/18\nLeague", "4:15pm", "Abington Heights", "Wallenpaupack", 3, 1, R.drawable.ah_team_logo, R.drawable.paupack, true),
        Game("10/19\nLeague", "6:00pm", "Scranton", "Abington Heights", 0, 5, R.drawable.scranton, R.drawable.ah_team_logo, true),
        Game("11/2\nDistrict Playoff", "6:00pm", "Abington Heights", "Delaware Valley", 2, 0, R.drawable.ah_team_logo, R.drawable.del_val, true),
        Game("11/4\nDistrict Championship", "4:15pm", "Abington Heights", "Wilkes Barre Area", 2, 1, R.drawable.ah_team_logo, R.drawable.wilkes, true),
        Game("11/8\nState Playoff", "6:00pm", "Abington Heights", "Pennridge", 1, 4, R.drawable.ah_team_logo, R.drawable.pennridge, false),



    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ScheduleRecyclerViewBinding.inflate(inflater, container, false)
        val rootView = binding.root


        val myAdapter = GameAdapter(games)
        binding.recyclerView.adapter = myAdapter

        return rootView

    }

}