package com.example.finalproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemScheduleBinding

class GameAdapter (val gameList: List<Game>) : RecyclerView.Adapter<GameHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameHolder {
        val binding = ListItemScheduleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GameHolder(binding)
    }

    override fun onBindViewHolder(currentViewHolder: GameHolder, position: Int) {
        val currentGame = gameList[position]
        currentViewHolder.bindGame(currentGame)
    }

    override fun getItemCount(): Int {
        return gameList.size
    }
}
