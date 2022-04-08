package com.doyeon.soptseminar.ui.signin

import android.os.Bundle
import com.doyeon.soptseminar.R
import com.doyeon.soptseminar.databinding.ActivitySignInBinding
import com.doyeon.soptseminar.util.BaseViewUtil

class SignInActivity :
    BaseViewUtil.BaseAppCompatActivity<ActivitySignInBinding>(R.layout.activity_sign_in) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    override fun initView() {}
}
