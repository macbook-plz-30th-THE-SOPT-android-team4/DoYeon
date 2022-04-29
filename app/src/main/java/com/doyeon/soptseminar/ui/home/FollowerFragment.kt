package com.doyeon.soptseminar.ui.home

import android.os.Bundle
import android.view.View
import com.doyeon.soptseminar.R
import com.doyeon.soptseminar.databinding.FragmentFollowerBinding
import com.doyeon.soptseminar.util.BaseViewUtil

class FollowerFragment :
    BaseViewUtil.BaseFragment<FragmentFollowerBinding>(R.layout.fragment_follower) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun initView() {}
}
