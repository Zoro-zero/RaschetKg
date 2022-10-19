package com.example.raschetkg.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.raschetkg.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this)[HomeViewModel::class.java]
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
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
      /*  val text = binding.edtKg.text.toString().toInt()
        val get= binding.edtCost.text.toString().toInt()
        var textget = binding.edtRemainder.toString().toInt()
        val multi :Int =text*get
        binding.tvT.text ="Your Result :"+multi*/
    }
    }

}


