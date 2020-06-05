package com.dakusuno.dakusunosubmition.view.detail

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.bumptech.glide.Glide
import com.dakusuno.dakusunosubmition.R
import com.dakusuno.dakusunosubmition.model.Fruit
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_detail.*

class DetailFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        activity?.toolbar?.title = "Detail ${arguments?.getString("name")}"
        super.onViewCreated(view, savedInstanceState)
        detail_look.text = arguments?.getString("look")
        detail_name.text = arguments?.getString("name")
        detail_store.text = arguments?.getString("store")
        Glide.with(view)
            .load(arguments?.getString("img"))
            .into(detail_img)
    }
}