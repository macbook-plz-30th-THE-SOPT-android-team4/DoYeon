package com.doyeon.soptseminar.ui.profile

import android.os.Bundle
import android.view.View
import com.doyeon.soptseminar.R
import com.doyeon.soptseminar.databinding.FragmentProfileBinding
import com.doyeon.soptseminar.util.BaseViewUtil

class ProfileFragment :
    BaseViewUtil.BaseFragment<FragmentProfileBinding>(R.layout.fragment_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun initView(){}
}
