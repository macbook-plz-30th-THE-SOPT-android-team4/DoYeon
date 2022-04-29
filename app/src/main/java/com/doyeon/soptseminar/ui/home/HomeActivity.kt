package com.doyeon.soptseminar.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.doyeon.soptseminar.R
import com.doyeon.soptseminar.databinding.ActivityHomeBinding
import com.doyeon.soptseminar.ui.camera.CameraFragment
import com.doyeon.soptseminar.ui.profile.ProfileFragment
import com.doyeon.soptseminar.util.BaseViewUtil

class HomeActivity :
    BaseViewUtil.BaseAppCompatActivity<ActivityHomeBinding>(R.layout.activity_home) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    override fun initView() {
        initHomeFragment()
        initBottomNavigation()
    }

    private fun initHomeFragment() {
        supportFragmentManager.beginTransaction().add(R.id.fcv_home, HomeFragment()).commit()
        binding.bnvHome.selectedItemId = R.id.menu_home
    }

    private fun initBottomNavigation() {
        binding.bnvHome.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_profile -> {
                    setFragment(ProfileFragment())
                    return@setOnItemSelectedListener true
                }
                R.id.menu_home -> {
                    setFragment(HomeFragment())
                    return@setOnItemSelectedListener true
                }
                R.id.menu_camera -> {
                    setFragment(CameraFragment())
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fcv_home, fragment).commit()
    }
}
