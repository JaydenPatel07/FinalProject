package com.example.finalproject

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemLayoutIndividualBinding

class PlayerHolder(val binding: ListItemLayoutIndividualBinding) :
    RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentPlayer: Player

    fun bindPlayer(player: Player) {
        currentPlayer = player
        binding.name.text = currentPlayer.name
        binding.achievements.text = currentPlayer.achievements
        binding.grade.text = currentPlayer.year
        binding.playerPic.setImageResource(currentPlayer.playerImageResourceID)

    }
}
//2518