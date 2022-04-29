package com.doyeon.soptseminar.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.doyeon.soptseminar.R
import com.doyeon.soptseminar.databinding.FragmentFollowerBinding
import com.doyeon.soptseminar.databinding.FragmentRepositoryBinding
import com.doyeon.soptseminar.model.FollowerData
import com.doyeon.soptseminar.model.RepositoryData
import com.doyeon.soptseminar.ui.home.adapter.FollowerAdapter
import com.doyeon.soptseminar.ui.home.adapter.RepositoryAdapter
import com.doyeon.soptseminar.util.BaseViewUtil

class RepositoryFragment :
    BaseViewUtil.BaseFragment<FragmentRepositoryBinding>(R.layout.fragment_repository) {

    private lateinit var repositoryAdapter: RepositoryAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun initView() {
        setAdapter()
        initData()
    }

    private fun setAdapter() {
        repositoryAdapter = RepositoryAdapter()
        binding.rvRepository.adapter = repositoryAdapter
    }

    private fun initData() {
        val fakeData = listOf(
            RepositoryData("레포지토리1", "과제1"),
            RepositoryData("레포지토리2", "과제2"),
            RepositoryData("레포지토리3", "과제3"),
            RepositoryData("레포지토리4", "과제4"),
            RepositoryData("레포지토리5", "과제5")
        )
        repositoryAdapter.submitList(fakeData)
    }
}
