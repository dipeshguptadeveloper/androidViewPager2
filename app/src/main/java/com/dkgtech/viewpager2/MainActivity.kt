package com.dkgtech.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.dkgtech.viewpager2.databinding.ActivityMainBinding
import com.dkgtech.viewpager2.model.FragmentDataModel
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tabText = ArrayList<FragmentDataModel>().apply {
            add(FragmentDataModel(R.drawable.chat_icon, "Chats"))
            add(FragmentDataModel(R.drawable.status_icon, "Status"))
            add(FragmentDataModel(R.drawable.call_icon, "Calls"))
        }

        binding.viewPager.adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(binding.tabLayout, binding.viewPager, object : TabConfigurationStrategy {
            override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
                tab.text = tabText[position].title
                tab.icon =
                    ResourcesCompat.getDrawable(resources, tabText[position].icon, null)
            }

        }).attach()

    }
}