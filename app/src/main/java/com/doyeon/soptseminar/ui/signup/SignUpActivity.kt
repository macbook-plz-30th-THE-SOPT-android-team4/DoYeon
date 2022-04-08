package com.doyeon.soptseminar.ui.signup

import android.os.Bundle
import com.doyeon.soptseminar.R
import com.doyeon.soptseminar.databinding.ActivitySignUpBinding
import com.doyeon.soptseminar.util.BaseViewUtil

class SignUpActivity :
    BaseViewUtil.BaseAppCompatActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    override fun initView() {
    }
}
