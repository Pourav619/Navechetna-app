package com.example.navchenta_welcome.bottom.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.navchenta_welcome.R
import com.example.navchenta_welcome.databinding.FragmentDashboardBinding
import com.example.navchenta_welcome.quiz_page

import com.example.navchenta_welcome.databinding.FragmentHomeBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root
//        var button1_dashboard=findViewById<Button>(R.id.dashbord_button1)


        val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    override fun onStart() {
        super.onStart()
        val btn = requireActivity().findViewById<Button>(R.id.dashbord_button1)
        btn.setOnClickListener {
            val intent = Intent(requireContext(), quiz_page::class.java)
            startActivity(intent)
        }
    }

}