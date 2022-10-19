package com.example.raschetkg.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.raschetkg.databinding.FragmentDashboardBinding

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
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        resulting()
    }
    fun resulting() {
        binding.ras.setOnClickListener{
            val res: Double
            val resd: Double
            val resCost:Double=java.lang.Double.valueOf(binding.edtRemainder.text.toString())
            val kg: Double = java.lang.Double.valueOf(binding.edtKg.text.toString())
            val cost: Double = java.lang.Double.valueOf(binding.edtCost.text.toString())
            resd=resCost*cost
            res=kg*cost-resd
            binding.tvT.text = "" + res
}}}