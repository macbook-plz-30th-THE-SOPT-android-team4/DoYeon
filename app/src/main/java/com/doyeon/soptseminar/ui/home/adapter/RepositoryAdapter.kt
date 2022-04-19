package com.doyeon.soptseminar.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.doyeon.soptseminar.databinding.ItemRepositoryBinding
import com.doyeon.soptseminar.model.RepositoryData

class RepositoryAdapter : ListAdapter<RepositoryData, RepositoryAdapter.RepositoryViewHolder>(diffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryViewHolder {
        return RepositoryViewHolder(
            ItemRepositoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RepositoryViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    class RepositoryViewHolder(
        private val binding: ItemRepositoryBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(repositoryData: RepositoryData) {
            binding.tvRepositoryName.text = repositoryData.name
            binding.tvRepositoryDesc.text = repositoryData.desc
            binding.executePendingBindings()
        }
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<RepositoryData>() {
            override fun areItemsTheSame(oldItem: RepositoryData, newItem: RepositoryData): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: RepositoryData, newItem: RepositoryData): Boolean {
                return oldItem == newItem
            }
        }
    }
}
