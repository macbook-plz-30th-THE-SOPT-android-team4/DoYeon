package com.doyeon.soptseminar.ui.home.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.doyeon.soptseminar.ui.home.FollowerFragment
import com.doyeon.soptseminar.ui.home.FollowingFragment

class FollowViewPagerAdapter(
    private val parentFragment: Fragment
) : FragmentStateAdapter(parentFragment) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FollowingFragment()
            else -> FollowerFragment()
        }
    }
}
