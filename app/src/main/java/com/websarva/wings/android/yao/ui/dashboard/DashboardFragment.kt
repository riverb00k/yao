package com.websarva.wings.android.yao.ui.dashboard

import android.os.Bundle
import android.content.ContentProvider
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.websarva.wings.android.yao.R
import com.websarva.wings.android.yao.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        setContentView(R.layout.fragment_dashboard)
        val calendar = findViewById<CalendarView>(R.id.calendar)

        return root
    }

    private fun <T> findViewById(calendar: Int){


    }

    private fun setContentView(activityCalendarview: Any) {

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}