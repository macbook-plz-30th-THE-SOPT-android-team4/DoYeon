package com.doyeon.soptseminar.ui.home

import android.os.Bundle
import com.doyeon.soptseminar.R
import com.doyeon.soptseminar.databinding.ActivityHomeBinding
import com.doyeon.soptseminar.util.BaseViewUtil

class HomeActivity :
    BaseViewUtil.BaseAppCompatActivity<ActivityHomeBinding>(R.layout.activity_home) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    override fun initView() {}
}
