package com.doyeon.soptseminar.ui.home

import android.os.Bundle
import android.view.View
import com.doyeon.soptseminar.R
import com.doyeon.soptseminar.databinding.FragmentHomeBinding
import com.doyeon.soptseminar.ui.home.adapter.FollowViewPagerAdapter
import com.doyeon.soptseminar.util.BaseViewUtil
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment :
    BaseViewUtil.BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    private val followTabTitles = listOf("팔로잉", "팔로워")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun initView() {
        initFollowViewPager()
        initFollowTabLayout()
    }

    private fun initFollowViewPager() {
        binding.vpHomeFollow.adapter = FollowViewPagerAdapter(this)
    }

    private fun initFollowTabLayout() {
        TabLayoutMediator(binding.tlHomeFollow, binding.vpHomeFollow) { tab, position ->
            tab.text = followTabTitles[position]
        }.attach()
    }
}
