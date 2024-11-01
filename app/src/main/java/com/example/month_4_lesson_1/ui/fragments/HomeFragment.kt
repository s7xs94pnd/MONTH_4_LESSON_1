package com.example.month_4_lesson_1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.month_4_lesson_1.databinding.FragmentHomeBinding
import com.example.month_4_lesson_1.ui.classes.AcData

class HomeFragment : Fragment() {

    private  var binding: FragmentHomeBinding?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater,container,false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnClicks()
    }

    private fun setOnClicks() {
        binding?.apply{
            buttonSend.setOnClickListener{
                if (!etName.text.isEmpty()){
                    if (!etEmail.text.isEmpty()){
                        if (!etPassword.text.isEmpty()){

                            val text = etPassword.text.toString()
                            val pasword = text.toInt()

                            val data = AcData(etName.text.toString(),etEmail.text.toString(), pasword)

                            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToAcInfoFragment(data))

                        } else
                            etPassword.error = "ERROR password is empty"
                    } else
                        etEmail.error = "ERROR email is empty"
                } else
                    etName.error = "ERROR name is empty"
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}