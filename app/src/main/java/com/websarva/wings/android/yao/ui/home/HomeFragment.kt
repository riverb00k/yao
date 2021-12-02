package com.websarva.wings.android.yao.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.websarva.wings.android.yao.R
import com.websarva.wings.android.yao.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.btView.setOnClickListener{
            findNavController().navigate(R.id.action_navigation_home_to_kusurimemoFragment)
        }
        binding.btAdd.setOnClickListener{
            findNavController().navigate(R.id.action_navigation_home_to_memoaddFragment)
        }


        /*binding.btAdd.setOnClickListener{
            findNavController().navigate(R.id.action_navigation_home_to_itemListDialogFragment)
        }*/
        //val textView: TextView = binding.textHome　コメントアウトしないと追加ボタンの中身が変わる
        //homeViewModel.text.observe(viewLifecycleOwner, Observer {
          //  textView.text = it
        //})
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}