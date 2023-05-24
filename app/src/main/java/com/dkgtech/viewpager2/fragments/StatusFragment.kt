package com.dkgtech.viewpager2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dkgtech.viewpager2.R
import com.dkgtech.viewpager2.databinding.FragmentStatusBinding


class StatusFragment : Fragment() {
    private lateinit var binding: FragmentStatusBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return FragmentStatusBinding.inflate(inflater, container, false).root
    }

}