package com.doyeon.soptseminar.ui.signup

import android.os.Bundle
import com.doyeon.soptseminar.R
import com.doyeon.soptseminar.databinding.ActivitySignUpBinding
import com.doyeon.soptseminar.util.BaseViewUtil
import com.doyeon.soptseminar.util.showShortToast

class SignUpActivity :
    BaseViewUtil.BaseAppCompatActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    override fun initView() {
        setClickListener()
    }

    private fun setClickListener() {
        binding.abSignUpSignup.setOnClickListener {
            if (isNameAndIdAndPwFieldFilled()) {
                finish()
            } else {
                showShortToast(resources.getString(R.string.signup_fail_toast))
            }
        }
    }

    private fun isNameAndIdAndPwFieldFilled(): Boolean {
        return binding.etSignUpName.text.toString().isNotEmpty()
                && binding.etSignUpId.text.toString().isNotEmpty()
                && binding.etSignUpPw.text.toString().isNotEmpty()
    }

}
