package com.akshaykumbhar.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.akshaykumbhar.coderswag.Adapter.categoryadpter
import com.akshaykumbhar.coderswag.Model.Category
import com.akshaykumbhar.coderswag.R
import com.akshaykumbhar.coderswag.Service.Dataservice
import com.akshaykumbhar.coderswag.Service.Dataservice.categories
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter : categoryadpter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = categoryadpter(this, Dataservice.categories)
        categorylist.adapter = adapter
    }
}
