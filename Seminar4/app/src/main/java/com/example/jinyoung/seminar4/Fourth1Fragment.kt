package com.example.jinyoung.seminar4

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first.view.*

/**
 * Created by Jinyoung on 2017-11-12.
 */
class Fourth1Fragment :Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

    val v= inflater!!.inflate(R.layout.sub_fragment1,container,false)

        return v

    }
}