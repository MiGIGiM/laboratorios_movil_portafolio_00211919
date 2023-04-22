package com.fmiguelop.laboratorio_5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController

class BillboardFragment : Fragment() {

    private lateinit var movieCard: CardView
    private lateinit var addButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_billboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind(view)

        clickListeners()
    }

    private fun bind(view: View) {
        movieCard = view.findViewById(R.id.movie_one_card_view)
        addButton = view.findViewById(R.id.add_movie_fab_btn)
    }

    private fun clickListeners() {
        movieCard.setOnClickListener {
            it.findNavController().navigate(R.id.action_billboardFragment_to_movieFragment)
        }

        addButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_billboardFragment_to_newMovierFragment)
        }
    }

}