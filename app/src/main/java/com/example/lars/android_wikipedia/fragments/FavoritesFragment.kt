package com.example.lars.android_wikipedia.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lars.android_wikipedia.R
import com.example.lars.android_wikipedia.adapters.ArticleCardRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_favorites.*


/**
 * A simple [Fragment] subclass.
 */
class FavoritesFragment : Fragment() {

    var favoritesRecycler: RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view =  inflater!!.inflate(R.layout.fragment_favorites, container, false)

        favoritesRecycler=view.findViewById(R.id.favorites_article_recycler)

        favoritesRecycler!!.layoutManager = LinearLayoutManager(context)
        favoritesRecycler!!.adapter= ArticleCardRecyclerAdapter()
        return view
    }

}// Required empty public constructor
