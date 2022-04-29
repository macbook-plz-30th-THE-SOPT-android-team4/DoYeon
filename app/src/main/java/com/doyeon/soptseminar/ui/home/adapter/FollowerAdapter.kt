package com.doyeon.soptseminar.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.doyeon.soptseminar.databinding.ItemFollowerBinding
import com.doyeon.soptseminar.model.FollowerData

class FollowerAdapter : ListAdapter<FollowerData, FollowerAdapter.FollowerViewHolder>(diffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowerViewHolder {
        return FollowerViewHolder(
            ItemFollowerBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: FollowerViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    class FollowerViewHolder(
        private val binding: ItemFollowerBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(followerData: FollowerData) {
            binding.tvFollowerName.text = followerData.name
            binding.tvFollowerDesc.text = followerData.desc
            binding.executePendingBindings()
        }
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<FollowerData>() {
            override fun areItemsTheSame(oldItem: FollowerData, newItem: FollowerData): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: FollowerData, newItem: FollowerData): Boolean {
                return oldItem == newItem
            }
        }
    }
}
