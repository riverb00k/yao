package com.websarva.wings.android.yao

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.websarva.wings.android.yao.databinding.FragmentHomeBinding
import com.websarva.wings.android.yao.databinding.FragmentKusurimemoBinding
import com.websarva.wings.android.yao.ui.home.HomeViewModel

class kusurimemoFragment : Fragment() {


    //private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentKusurimemoBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.fragment_kusurimemo, container, false)

        _binding = FragmentKusurimemoBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.memobackbtn.setOnClickListener{
            findNavController().navigate(R.id.action_kusurimemoFragment_to_navigation_home)
        }
        return root
    }
}