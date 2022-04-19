package com.doyeon.soptseminar.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.doyeon.soptseminar.R
import com.doyeon.soptseminar.databinding.FragmentFollowerBinding
import com.doyeon.soptseminar.model.FollowerData
import com.doyeon.soptseminar.ui.home.adapter.FollowerAdapter
import com.doyeon.soptseminar.util.BaseViewUtil

class FollowerFragment :
    BaseViewUtil.BaseFragment<FragmentFollowerBinding>(R.layout.fragment_follower) {

    private lateinit var followerAdapter: FollowerAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun initView() {
        setAdapter()
        initData()
    }

    private fun setAdapter() {
        followerAdapter = FollowerAdapter()
        binding.rvFollower.adapter = followerAdapter
    }

    private fun initData() {
        val fakeData = listOf(
            FollowerData("이름1", "설명1"),
            FollowerData("이름2", "설명2"),
            FollowerData("이름3", "설명3"),
            FollowerData("이름4", "설명4"),
            FollowerData("이름5", "설명5")
        )
        followerAdapter.submitList(fakeData)
    }
}
