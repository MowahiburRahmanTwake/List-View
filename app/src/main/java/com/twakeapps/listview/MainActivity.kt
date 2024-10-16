package com.twakeapps.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.twakeapps.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val countryName:Array<String> = arrayOf("Bangladesh","India","Nepal","Bhutan","China","Japan","Pakistan","Afghanistan")

        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,
                                                             com.google.android.material.R.layout.support_simple_spinner_dropdown_item,countryName)

        binding.listView.adapter = arrayAdapter

        binding.listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "$position--${countryName[position]}", Toast.LENGTH_SHORT).show()
        }

    }
}