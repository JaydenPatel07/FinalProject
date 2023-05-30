package com.example.finalproject

import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemScheduleBinding

class GameHolder(val binding: ListItemScheduleBinding) :
    RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentGame: Game

    fun bindGame(game: Game) {
        currentGame = game
        binding.awayPic.setImageResource(currentGame.awayPicResourceID)
        binding.homePic.setImageResource(currentGame.homePicResourceID)
        binding.scoreHome.text = currentGame.homeScore.toString()
        binding.awayScore.text = currentGame.awayScore.toString()
        binding.awayText.text = currentGame.awayName
        binding.homeText.text = currentGame.homeName

        if(currentGame.winOrNot){
            binding.scoreHome.setTextColor(Color.GREEN)
            binding.awayScore.setTextColor(Color.GREEN)

        }
        else{
            binding.awayScore.setTextColor(Color.RED)
            binding.scoreHome.setTextColor(Color.RED)


        }


    }
}
//2518}