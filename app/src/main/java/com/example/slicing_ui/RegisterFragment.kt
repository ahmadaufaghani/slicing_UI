package com.example.slicing_ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.slicing_ui.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    private var _binding:FragmentRegisterBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentRegisterBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.tvSigninBtn.setOnClickListener {
            navigateToSignIn()
        }
    }

    private fun navigateToSignIn() {
        val direction = RegisterFragmentDirections.actionRegisterFragmentToLoginFragment()
        findNavController().navigate(direction)
    }
}