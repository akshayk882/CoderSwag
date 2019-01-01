package com.akshaykumbhar.coderswag.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.akshaykumbhar.coderswag.Model.Product
import com.akshaykumbhar.coderswag.R

class Productadapter(val context: Context,val product : List<Product>): RecyclerView.Adapter<Productadapter.ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ProductHolder
    {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item,parent,false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return product.count()
    }

    override fun onBindViewHolder(holder:ProductHolder,position: Int) {
        holder.BindView(context,product[position])
    }

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val Productimage = itemView.findViewById<ImageView>(R.id.ProductImage)
        val Productname = itemView.findViewById<TextView>(R.id.ProductName)
        val ProductPrice = itemView.findViewById<TextView>(R.id.ProductPrice)
        fun BindView(context: Context,products: Product)
        {
            val resourceId = context.resources.getIdentifier(products.image,"drawable",context.packageName)
            Productimage?.setImageResource(resourceId)
            Productname?.text = products.title
            ProductPrice?.text = products.Price
        }
    }

}