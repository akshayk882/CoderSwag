package com.akshaykumbhar.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.akshaykumbhar.coderswag.R
import com.akshaykumbhar.coderswag.Utilities.EXTRA

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val productcategory = intent.getStringExtra(EXTRA)
    }
}
