package com.example.android.eggtimernotifications.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.android.eggtimernotifications.R
import com.example.android.eggtimernotifications.databinding.FragmentEggTimerBinding

class EggTimerFragment : Fragment() {

    private val TOPIC = "breakfast"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentEggTimerBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_egg_timer, container, false
        )
        val viewModel = ViewModelProviders.of(this).get(EggTimerViewModel::class.java)
        binding.eggTimerViewModel = viewModel
        binding.lifecycleOwner = this.viewLifecycleOwner
        return binding.root
    }


    companion object {
        fun newInstance() = EggTimerFragment()
    }
}

