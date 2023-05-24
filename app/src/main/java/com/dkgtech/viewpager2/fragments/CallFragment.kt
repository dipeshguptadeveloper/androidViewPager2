package com.dkgtech.viewpager2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dkgtech.viewpager2.R
import com.dkgtech.viewpager2.databinding.FragmentCallBinding

class CallFragment : Fragment() {

    private lateinit var binding: FragmentCallBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCallBinding.inflate(inflater, container, false)
        return binding.root
    }

}