package com.splashscreen.sharedtransitiontest

import android.os.Bundle
import android.transition.TransitionInflater
import androidx.fragment.app.Fragment

class KotlinDetailsFragment:Fragment(R.layout.fragment_kotlin_details) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val anim=TransitionInflater.from(requireContext()).inflateTransition(android.R.transition.move)
        sharedElementEnterTransition=anim
        sharedElementReturnTransition=anim
    }
}