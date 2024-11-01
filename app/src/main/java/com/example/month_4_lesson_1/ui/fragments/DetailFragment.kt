package com.example.month_4_lesson_1.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.month_4_lesson_1.databinding.FragmentAcInfoBinding
import com.example.month_4_lesson_1.ui.classes.AcData

class DetailFragment : Fragment() {
    private val cameArgs by navArgs<DetailFragmentArgs>()
    private  var binding: FragmentAcInfoBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAcInfoBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val acData = cameArgs.data
        setData(acData)
    }

    private fun setData(data: AcData) {
        binding!!.apply {
            tvName.text = data.name
            tvEmail.text = data.email
            tvPassword.text = data.password.toString()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}