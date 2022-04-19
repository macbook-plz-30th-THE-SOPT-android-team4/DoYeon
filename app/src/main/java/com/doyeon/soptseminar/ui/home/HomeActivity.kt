package com.doyeon.soptseminar.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.doyeon.soptseminar.R
import com.doyeon.soptseminar.databinding.ActivityHomeBinding
import com.doyeon.soptseminar.util.BaseViewUtil

class HomeActivity :
    BaseViewUtil.BaseAppCompatActivity<ActivityHomeBinding>(R.layout.activity_home) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    override fun initView() {
        initListFragment()
        setClickListener()
    }

    private fun initListFragment() {
        setListFragment(FollowerFragment())
    }

    private fun setClickListener() {
        binding.acbHomeFollower.setOnClickListener {
            setListFragment(FollowerFragment())
        }
    }

    private fun setListFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fcv_home, fragment).commit()
    }
}
