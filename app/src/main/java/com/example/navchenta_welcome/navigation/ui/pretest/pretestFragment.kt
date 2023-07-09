package com.example.navchenta_welcome.navigation.ui.pretest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.navchenta_welcome.databinding.FragmentPretestBinding

class pretestFragment : Fragment() {

    private var _binding: FragmentPretestBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val PretestViewModel =
            ViewModelProvider(this).get(pretestViewModel::class.java)

        _binding = FragmentPretestBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textPretest
        PretestViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}