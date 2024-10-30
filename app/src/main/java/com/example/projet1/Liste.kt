package com.example.projet1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Liste : Fragment(R.layout.liste) {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CityAdapter
    private lateinit var cityList: List<City>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.liste, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        cityList = listOf(
            City("Maroc", R.drawable.maroc),
            City("Italie" , R.drawable.italie),
            City("Japan" , R.drawable.japan),
            City("UK", R.drawable.uk),
            City("France", R.drawable.france)
        )
        adapter = CityAdapter(cityList)
        recyclerView.adapter = adapter
    }
}
