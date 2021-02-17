package com.example.navigationprimercd.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationprimercd.databinding.FragmentTextEntryBinding

class TextEntryFragment : Fragment() {
    private lateinit var binding: FragmentTextEntryBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentTextEntryBinding.inflate(
        inflater,
        container,
        false
    ).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNext.setOnClickListener {
            val message = binding.etToSplit.text?.toString() ?: ""
            val action = TextEntryFragmentDirections.actionTextEntryFragmentToSplitTextDecisionFragment(message)
            findNavController().navigate(action)
        }
    }
}