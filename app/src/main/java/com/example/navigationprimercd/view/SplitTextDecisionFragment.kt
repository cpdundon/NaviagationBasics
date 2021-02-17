package com.example.navigationprimercd.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationprimercd.R
import com.example.navigationprimercd.databinding.FragmentSplitTextDecisionBinding


class SplitTextDecisionFragment : Fragment() {
    private lateinit var binding: FragmentSplitTextDecisionBinding

    private val arguments by navArgs<SplitTextDecisionFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentSplitTextDecisionBinding.inflate(
        inflater,
        container,
        false
    ).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvBeforeSplit.text = arguments.textToSplit

        binding.btnFirstHalf.setOnClickListener {
            var message = binding.tvBeforeSplit.text?.toString() ?: ""
            message = message.substring(0, message.length / 2)
            val action = SplitTextDecisionFragmentDirections.actionSplitTextDecisionFragmentToHalfTextDisplayFragment(message)
            findNavController().navigate(action)
        }

        binding.btnSecondHalf.setOnClickListener {
            var message = binding.tvBeforeSplit.text?.toString() ?: ""
            message = message.substring(message.length / 2)
            val action = SplitTextDecisionFragmentDirections.actionSplitTextDecisionFragmentToHalfTextDisplayFragment(message)
            findNavController().navigate(action)
        }
    }

}