package com.doyeon.soptseminar.ui.home

import android.os.Bundle
import android.view.View
import com.doyeon.soptseminar.R
import com.doyeon.soptseminar.databinding.FragmentFollowingBinding
import com.doyeon.soptseminar.util.BaseViewUtil

class FollowingFragment :
    BaseViewUtil.BaseFragment<FragmentFollowingBinding>(R.layout.fragment_following) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun initView() {}
}
