package com.example.navigationprimercd.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationprimercd.R
import com.example.navigationprimercd.databinding.FragmentHalfTextDisplayBinding
import com.example.navigationprimercd.databinding.FragmentSplitTextDecisionBinding

class HalfTextDisplayFragment : Fragment() {
    private lateinit var binding: FragmentHalfTextDisplayBinding

    private val arguments by navArgs<HalfTextDisplayFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentHalfTextDisplayBinding.inflate(
        inflater,
        container,
        false
    ).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvAfterSplit.text = arguments.splitString
    }
}