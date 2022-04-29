package com.doyeon.soptseminar.ui.profile

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.core.view.children
import com.bumptech.glide.Glide
import com.doyeon.soptseminar.R
import com.doyeon.soptseminar.databinding.FragmentProfileBinding
import com.doyeon.soptseminar.model.FollowerData
import com.doyeon.soptseminar.model.RepositoryData
import com.doyeon.soptseminar.ui.home.adapter.FollowerAdapter
import com.doyeon.soptseminar.ui.home.adapter.RepositoryAdapter
import com.doyeon.soptseminar.util.BaseViewUtil

class ProfileFragment :
    BaseViewUtil.BaseFragment<FragmentProfileBinding>(R.layout.fragment_profile) {

    private lateinit var followerAdapter: FollowerAdapter
    private lateinit var repositoryAdapter: RepositoryAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun initView() {
        setProfileInfo()
        setFollowerAndRepository()
    }

    private fun setProfileInfo() {
        Glide.with(requireContext())
            .load(R.drawable.bg_home_my)
            .circleCrop()
            .into(binding.ivProfile)
    }

    private fun setFollowerAndRepository() {
        followerAdapter = FollowerAdapter()
        repositoryAdapter = RepositoryAdapter()

        initFollowerFakeData()
        initRepositoryFakeData()
        setFollowerAndRepositoryChangeListener()

        binding.rgProfile.check(binding.rbProfileFollower.id)
    }

    private fun initFollowerFakeData() {
        val fakeData = listOf(
            FollowerData("이름1", "설명1"),
            FollowerData("이름2", "설명2"),
            FollowerData("이름3", "설명3"),
            FollowerData("이름4", "설명4"),
            FollowerData("이름5", "설명5")
        )
        followerAdapter.submitList(fakeData)
    }

    private fun initRepositoryFakeData() {
        val fakeData = listOf(
            RepositoryData("레포지토리1", "과제1"),
            RepositoryData("레포지토리2", "과제2"),
            RepositoryData("레포지토리3", "과제3"),
            RepositoryData("레포지토리4", "과제4"),
            RepositoryData("레포지토리5", "과제5")
        )
        repositoryAdapter.submitList(fakeData)
    }

    private fun setFollowerAndRepositoryChangeListener() {
        binding.rgProfile.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                binding.rbProfileFollower.id -> {
                    binding.rvProfile.adapter = followerAdapter
                }
                binding.rbProfileRepository.id -> {
                    binding.rvProfile.adapter = repositoryAdapter
                }
            }
            changeFollowerAndRepositoryFont()
        }
    }

    private fun changeFollowerAndRepositoryFont() {
        binding.rgProfile.children.forEach {
            (it as RadioButton).apply {
                typeface = when (isChecked) {
                    true -> resources.getFont(R.font.noto_sans_kr_medium)
                    false -> resources.getFont(R.font.noto_sans_kr_regular)
                }
            }
        }
    }
}
