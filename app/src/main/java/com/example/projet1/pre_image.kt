package com.example.projet1

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class Pre_image : Fragment(R.layout.pre_image) {

    private lateinit var imageView: ImageView
    private lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.pre_image, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        imageView = view.findViewById(R.id.image)
        textView = view.findViewById(R.id.textdes)


        imageView.setImageResource(R.drawable.message)


        textView.text = "Cette application permet d'avoir des" +
                " conversations instantanées et sécurisées," +
                " avec de nombreuses fonctionnalités pour rester" +
                " connecté avec vos amis et votre famille."
    }
}