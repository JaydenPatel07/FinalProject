package com.example.finalproject

import android.media.MediaPlayer
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.finalproject.databinding.FragmentAchievementsBinding

class AchievementsFragment : Fragment() {

    var team_or_individual = ""
    lateinit var music: MediaPlayer
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
                binding.achievements.text = "District 2 AAAA Champions\nLackawanna League Division 1 Champions\n14-0 League Record\n18-2 Overall Record\n+52 Goal Differential\nAllowed 5 goals in 14 League Games\n10 Shutouts in 14 league games"
                binding.spinner.setSelection(0)
            }
            override fun onNothingSelected(adapterView: AdapterView<*>?) {

            }
        }
        setHasOptionsMenu(true)

        music = MediaPlayer.create(context, R.raw.music);
        music.isLooping = true
        music.start()
        var current = music.currentPosition + 10000
        music.seekTo(current)
        binding.pauseButton.setOnClickListener {
            if (music.isPlaying) {
                music.pause()
                binding.pauseButton.setImageResource(R.drawable.baseline_play_circle_24)
            }
            else {
                music.start()
                binding.pauseButton.setImageResource(R.drawable.baseline_pause_circle_24)
            }
        }
        return rootView

    }
    override fun onStop() {
        super.onStop()
        music.release()
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController()) || super.onContextItemSelected(item)
    }





}