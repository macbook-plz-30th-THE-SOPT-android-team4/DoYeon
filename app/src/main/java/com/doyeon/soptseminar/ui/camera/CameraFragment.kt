package com.doyeon.soptseminar.ui.camera

import android.os.Bundle
import android.view.View
import com.doyeon.soptseminar.R
import com.doyeon.soptseminar.databinding.FragmentCameraBinding
import com.doyeon.soptseminar.util.BaseViewUtil

class CameraFragment :
    BaseViewUtil.BaseFragment<FragmentCameraBinding>(R.layout.fragment_camera) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun initView(){}
}
