package com.example.raschetkg.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.raschetkg.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
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