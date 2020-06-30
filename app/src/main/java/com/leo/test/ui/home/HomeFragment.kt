package com.leo.test.ui.home

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.leo.test.R
import com.leo.test.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private val homeViewModel: HomeViewModel by viewModels()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("HomeFragment life cycle", "onAttach")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel.bindLifecycle(this)
        Log.i("HomeFragment life cycle", "onCreate")
        val root = inflater.inflate(R.layout.fragment_home, container, false)
//        val textView: TextView = root.findViewById(R.id.text_home)
//        homeViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        val binding = FragmentHomeBinding.bind(root)
        binding.vm = homeViewModel
        binding.lifecycleOwner = this

        return root
    }

    override fun onStart() {
        super.onStart()
        Log.i("HomeFragment life cycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("HomeFragment life cycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("HomeFragment life cycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("HomeFragment life cycle", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("HomeFragment life cycle", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("HomeFragment life cycle", "onDestroy")
        homeViewModel.unbindLifecycle(this)
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("HomeFragment life cycle", "onDetach")
    }

}