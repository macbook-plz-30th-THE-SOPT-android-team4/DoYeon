package com.doyeon.soptseminar.ui.home

import android.os.Bundle
import android.view.View
import com.doyeon.soptseminar.R
import com.doyeon.soptseminar.databinding.FragmentHomeBinding
import com.doyeon.soptseminar.util.BaseViewUtil

class HomeFragment :
    BaseViewUtil.BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun initView(){}
}
