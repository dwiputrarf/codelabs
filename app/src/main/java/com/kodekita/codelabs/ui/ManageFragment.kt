package com.kodekita.codelabs.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kodekita.codelabs.databinding.FragmentManageBinding

class ManageFragment : Fragment() {

    private var _binding: FragmentManageBinding? = null

    private val binding get() = _binding!!

    private var toggle: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentManageBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            binding.btnToggle.setOnClickListener {
                toggle = !toggle
            }
        }
    }
}