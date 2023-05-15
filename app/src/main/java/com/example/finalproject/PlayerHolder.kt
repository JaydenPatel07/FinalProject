package com.example.finalproject

import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.FragmentIndividualAchievementsFragmentBinding

class PlayerHolder(val binding: FragmentIndividualAchievementsFragmentBinding) :
    RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentPlayer: Player

    fun bindPlayer(player: Player) {
        currentPlayer = player
        binding.name.text = currentPlayer.name
        binding.achievements.text = currentPlayer.achievements
        binding.grade.text = currentPlayer.year
        binding.imageViewCourseImage.setImageResource(currentPlayer.playerImageResourceID)

    }
}