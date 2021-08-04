package com.mrblrrd.navigationbug

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class AFragment : Fragment(R.layout.fragment_a_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.openBottomSheetDialogButton).setOnClickListener {
            findNavController().navigate(R.id.action_AFragment_to_ABottomSheetDialogFragment)
        }
    }
}