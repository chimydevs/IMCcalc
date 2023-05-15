package com.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat

class IMCcalculatorApp : AppCompatActivity() {

    private var isMaleSelected:Boolean = true
    private var isFemaleSelected:Boolean = false


    private lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imccalculator_app)
        initComponents()
        initListeners()
    }

    private fun initComponents(){
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
    }

    private fun initListeners(){
        viewMale.setOnClickListener{setGenderColor()}
        viewFemale.setOnClickListener{setGenderColor()}
    }

    private fun setGenderColor(isViewSelected:Boolean){

        viewMale.setCardBackgroundColor()
        viewFemale.setCardBackgroundColor(femaleColor)
    }

    private fun getBackgroundColor(isSelectedComponent:Boolean){

        ContextCompat

        val maleColor = if(isSelectedComponent){
            R.color.background_component_selected
        }else{
            R.color.background_component
        }
    }


}


