package com.flaringapp.test.predictivepackanim

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_a, container, false).also {
            it.findViewById<Button>(R.id.button_fragment_b).setOnClickListener {
                findNavController().navigate(R.id.action_fragmentA_to_fragmentB)
            }
        }
    }
}
