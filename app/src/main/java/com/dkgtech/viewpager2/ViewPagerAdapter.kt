package com.dkgtech.viewpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.dkgtech.viewpager2.fragments.CallFragment
import com.dkgtech.viewpager2.fragments.ChatFragment
import com.dkgtech.viewpager2.fragments.StatusFragment

class ViewPagerAdapter(private val fm: FragmentManager, private val lifecycle: Lifecycle) :
    FragmentStateAdapter(fm, lifecycle) {
    override fun getItemCount(): Int {
        return 3 // no. of tabs
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                ChatFragment()
            }

            1 -> {
                CallFragment()
            }

            else -> StatusFragment()
        }
    }
}