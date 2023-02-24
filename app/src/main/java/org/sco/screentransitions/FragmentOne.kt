package org.sco.screentransitions

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import org.sco.screentransitions.databinding.FragmentOneBinding

class FragmentOne: Fragment(R.layout.fragment_one) {
    private lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fragmentTwoButton.setOnClickListener {
            Log.d("FragmentOne","Navigating to Fragment 2")

            findNavController().navigate(R.id.action_fragmentOne_to_fragmentTwo)

        }

        binding.fragmentThreeButton.setOnClickListener {
            Log.d("FragmentOne","Navigating to Fragment 3")

            findNavController().navigate(R.id.action_fragmentOne_to_fragmentThree)
        }

        binding.backButton.setOnClickListener {
            activity?.onBackPressedDispatcher?.onBackPressed()
        }
    }
}