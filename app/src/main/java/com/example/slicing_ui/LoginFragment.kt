package com.example.slicing_ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.slicing_ui.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    private var _binding:FragmentLoginBinding? = null
    private val binding get() = _binding!!
    private val args: LoginFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvSignupLogin.setOnClickListener {
            navigateSignUp()
        }

        val nama = args.nama
        Toast.makeText(requireContext(), "Welcome aboard $nama", Toast.LENGTH_SHORT).show()
    }

    private fun navigateSignUp() {
        val direction = LoginFragmentDirections.actionLoginFragmentToRegisterFragment()
        findNavController().navigate(direction)
    }
}