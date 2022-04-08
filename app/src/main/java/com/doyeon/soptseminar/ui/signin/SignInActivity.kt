package com.doyeon.soptseminar.ui.signin

import android.content.Intent
import android.os.Bundle
import com.doyeon.soptseminar.R
import com.doyeon.soptseminar.databinding.ActivitySignInBinding
import com.doyeon.soptseminar.ui.signup.SignUpActivity
import com.doyeon.soptseminar.util.BaseViewUtil
import com.doyeon.soptseminar.util.showShortToast

class SignInActivity :
    BaseViewUtil.BaseAppCompatActivity<ActivitySignInBinding>(R.layout.activity_sign_in) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    override fun initView() {
        setClickListener()
    }

    private fun setClickListener() {
        binding.abSignInLogin.setOnClickListener {
            if (isIdAndPwFieldFilled()) {
                showShortToast(resources.getString(R.string.login_success_toast))
            } else {
                showShortToast(resources.getString(R.string.login_fail_toast))
            }
        }
        binding.abSignInSignup.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }

    private fun isIdAndPwFieldFilled(): Boolean {
        return binding.etSignInId.text.toString().isNotEmpty()
                && binding.etSignInPw.text.toString().isNotEmpty()
    }
}
