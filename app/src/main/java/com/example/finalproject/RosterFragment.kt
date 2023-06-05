package com.example.finalproject

import android.os.Bundle
import android.view.*
import androidx.dynamicanimation.animation.DynamicAnimation
import androidx.dynamicanimation.animation.SpringAnimation
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.finalproject.databinding.FragmentIndividualRecyclerViewBinding
import com.example.finalproject.databinding.FragmentRosterBinding

class RosterFragment : Fragment() {
    private var _binding: FragmentRosterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRosterBinding.inflate(inflater, container, false)
        val rootView = binding.root
        binding.kohen.setVisibility(View.INVISIBLE)
        binding.mike.setVisibility(View.INVISIBLE)
        binding.justin.setVisibility(View.INVISIBLE)
        binding.jayden.setVisibility(View.INVISIBLE)
        binding.sam.setVisibility(View.INVISIBLE)
        binding.byron.setVisibility(View.INVISIBLE)
        binding.jack.setVisibility(View.INVISIBLE)
        binding.niko.setVisibility(View.INVISIBLE)
        binding.rob.setVisibility(View.INVISIBLE)
        binding.nico.setVisibility(View.INVISIBLE)
        binding.nick.setVisibility(View.INVISIBLE)
        binding.mity.setVisibility(View.INVISIBLE)
        binding.luke.setVisibility(View.INVISIBLE)
        binding.enzo.setVisibility(View.INVISIBLE)
        binding.palle.setVisibility(View.INVISIBLE)
        binding.nath.setVisibility(View.INVISIBLE)
        binding.hiller.setVisibility(View.INVISIBLE)
        binding.hank.setVisibility(View.INVISIBLE)
        binding.grogan.setVisibility(View.INVISIBLE)
        binding.red.setVisibility(View.INVISIBLE)
        binding.brad.setVisibility(View.INVISIBLE)
        binding.phil.setVisibility(View.INVISIBLE)

        binding.starting.setOnClickListener{
            binding.mity.setVisibility(View.INVISIBLE)
            binding.luke.setVisibility(View.INVISIBLE)
            binding.enzo.setVisibility(View.INVISIBLE)
            binding.palle.setVisibility(View.INVISIBLE)
            binding.nath.setVisibility(View.INVISIBLE)
            binding.hiller.setVisibility(View.INVISIBLE)
            binding.hank.setVisibility(View.INVISIBLE)
            binding.grogan.setVisibility(View.INVISIBLE)
            binding.red.setVisibility(View.INVISIBLE)
            binding.brad.setVisibility(View.INVISIBLE)
            binding.phil.setVisibility(View.INVISIBLE)

            binding.kohen.setVisibility(View.VISIBLE)
            binding.mike.setVisibility(View.VISIBLE)
            binding.justin.setVisibility(View.VISIBLE)
            binding.jayden.setVisibility(View.VISIBLE)
            binding.sam.setVisibility(View.VISIBLE)
            binding.byron.setVisibility(View.VISIBLE)
            binding.jack.setVisibility(View.VISIBLE)
            binding.niko.setVisibility(View.VISIBLE)
            binding.rob.setVisibility(View.VISIBLE)
            binding.nico.setVisibility(View.VISIBLE)
            binding.nick.setVisibility(View.VISIBLE)
        }
        binding.button2.setOnClickListener{
            binding.kohen.setVisibility(View.INVISIBLE)
            binding.mike.setVisibility(View.INVISIBLE)
            binding.justin.setVisibility(View.INVISIBLE)
            binding.jayden.setVisibility(View.INVISIBLE)
            binding.sam.setVisibility(View.INVISIBLE)
            binding.byron.setVisibility(View.INVISIBLE)
            binding.jack.setVisibility(View.INVISIBLE)
            binding.niko.setVisibility(View.INVISIBLE)
            binding.rob.setVisibility(View.INVISIBLE)
            binding.nico.setVisibility(View.INVISIBLE)
            binding.nick.setVisibility(View.INVISIBLE)

            binding.mity.setVisibility(View.VISIBLE)
            binding.luke.setVisibility(View.VISIBLE)
            binding.enzo.setVisibility(View.VISIBLE)
            binding.palle.setVisibility(View.VISIBLE)
            binding.nath.setVisibility(View.VISIBLE)
            binding.hiller.setVisibility(View.VISIBLE)
            binding.hank.setVisibility(View.VISIBLE)
            binding.grogan.setVisibility(View.VISIBLE)
            binding.red.setVisibility(View.VISIBLE)
            binding.brad.setVisibility(View.VISIBLE)
            binding.phil.setVisibility(View.VISIBLE)

        }
        return rootView

    }



override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
    super.onCreateOptionsMenu(menu, inflater)
    inflater.inflate(R.menu.options_menu,menu)
}

override fun onOptionsItemSelected(item: MenuItem): Boolean {
    return NavigationUI.onNavDestinationSelected(item, requireView().findNavController()) || super.onContextItemSelected(item)
}
}