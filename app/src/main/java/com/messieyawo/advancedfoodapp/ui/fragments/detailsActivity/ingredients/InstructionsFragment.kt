package com.messieyawo.advancedfoodapp.ui.fragments.detailsActivity.ingredients

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import com.messieyawo.advancedfoodapp.R
import com.messieyawo.advancedfoodapp.databinding.FragmentInstructionsBinding
import com.messieyawo.advancedfoodapp.model.Result
import com.messieyawo.advancedfoodapp.utils.Constants.Companion.RECIPE_RESULT_KEY


class InstructionsFragment : Fragment() {
    private var _binding: FragmentInstructionsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        _binding = FragmentInstructionsBinding.inflate(inflater, container, false)
        val args = arguments
        val myBundle: Result? = args!!.getParcelable(RECIPE_RESULT_KEY)

        binding.instructionsWebView.webViewClient = object : WebViewClient() {}

        val websiteUrl: String = myBundle!!.sourceUrl
        binding.instructionsWebView.loadUrl(websiteUrl)

        return binding.root
    }


}