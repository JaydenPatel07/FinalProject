package com.example.finalproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemLayoutIndividualBinding

class PlayerAdapter (val playerList: List<Player>) : RecyclerView.Adapter<PlayerHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerHolder {
        val binding = ListItemLayoutIndividualBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PlayerHolder(binding)
    }

    override fun onBindViewHolder(currentViewHolder: PlayerHolder, position: Int) {
        val currentPlayer = playerList[position]
        currentViewHolder.bindPlayer(currentPlayer)
    }

    override fun getItemCount(): Int {
        return playerList.size
    }
}
