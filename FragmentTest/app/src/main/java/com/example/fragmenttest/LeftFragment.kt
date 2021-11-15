package com.example.fragmenttest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class LeftFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (activity!=null) {
            val mainActivity = activity as MainActivity
            val leftFragment = mainActivity.supportFragmentManager.findFragmentById(R.id.leftFrag) as Fragment
            val leftFragment1 = mainActivity.leftFrag as Fragment
        }
        return inflater.inflate(R.layout.left_fragment, container, false)
    }
}