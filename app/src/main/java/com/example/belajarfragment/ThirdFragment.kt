package com.example.belajarfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class ThirdFragment : Fragment() {
    private var communicationViewModel: CommunicationViewModel? = null
    private var txtName: TextView? = null
    private var txtName2: TextView? = null
    private var txtNomor: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel = ViewModelProviders. of(requireActivity()). get(CommunicationViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtName = view.findViewById(R.id.textView)
        communicationViewModel!!.fname.observe(requireActivity(), Observer { s -> txtName!!.text = s })
        txtName2 = view.findViewById(R.id.textView2)
        communicationViewModel!!.lname.observe(requireActivity(), Observer { s -> txtName2!!.text = s })
        txtNomor = view.findViewById(R.id.textView3)
        communicationViewModel!!.nomor.observe(requireActivity(), Observer { s -> txtNomor!!.text = s })
    }

    companion object {
        fun newInstance(): ThirdFragment {
            return ThirdFragment()
        }
    }
}