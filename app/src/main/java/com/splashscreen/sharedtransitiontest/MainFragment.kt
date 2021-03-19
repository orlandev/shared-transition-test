package com.splashscreen.sharedtransitiontest

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.splashscreen.sharedtransitiontest.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {
    private lateinit var _binding: FragmentMainBinding
    private val binding: FragmentMainBinding get() = _binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)

        binding.ivKotlin.setOnClickListener(View.OnClickListener {
            val extras = FragmentNavigatorExtras(binding.ivKotlin to "image_kotlin_big",binding.kotlinText to "text_title_big")
            findNavController().navigate(
                R.id.action_mainFragment_to_kotlinDetailsFragment,
                null,
                null,
                extras
            )
        })

    }

}