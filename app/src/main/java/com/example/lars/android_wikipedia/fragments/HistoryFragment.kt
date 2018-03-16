package com.example.lars.android_wikipedia.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lars.android_wikipedia.R
import com.example.lars.android_wikipedia.adapters.ArticleListItemRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_history.*


/**
 * A simple [Fragment] subclass.
 */
class HistoryFragment : Fragment() {


    var historyRecycler : RecyclerView? = null
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater!!.inflate(R.layout.fragment_history, container, false)

        historyRecycler = view.findViewById(R.id.history_article_recycler)

        historyRecycler!!.layoutManager = LinearLayoutManager(context)
        historyRecycler!!.adapter= ArticleListItemRecyclerAdapter()
        return view
    }

}// Required empty public constructor
