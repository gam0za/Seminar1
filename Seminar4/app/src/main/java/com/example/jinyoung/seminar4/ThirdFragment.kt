package com.example.jinyoung.seminar4

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first.view.*
import kotlinx.android.synthetic.main.fragment_third.view.*

/**
 * Created by Jinyoung on 2017-11-11.
 */
class ThirdFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val v= inflater!!.inflate(R.layout.fragment_third,container,false) //레이아웃을 붙이는 과정
        if(arguments!=null){
            v!!.third_text.text = arguments.getString("title")
        }
        return v
    }
}