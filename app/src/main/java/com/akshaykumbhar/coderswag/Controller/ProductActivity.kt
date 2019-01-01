package com.akshaykumbhar.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.GridLayout
import com.akshaykumbhar.coderswag.Adapter.Productadapter
import com.akshaykumbhar.coderswag.R
import com.akshaykumbhar.coderswag.Service.Dataservice
import com.akshaykumbhar.coderswag.Utilities.EXTRA
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {
lateinit var adapter: Productadapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val productcategory = intent.getStringExtra(EXTRA)
        adapter = Productadapter(this,Dataservice.getProduct(productcategory))
        productview.adapter = adapter
        val orientation = resources.configuration.orientation
        var spanCount = 2
        if(orientation == 2)
            spanCount = 3
        val layoutmanager = GridLayoutManager(this,spanCount)
        productview.layoutManager = layoutmanager
    }
}
