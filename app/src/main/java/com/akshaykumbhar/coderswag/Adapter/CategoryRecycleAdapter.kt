package com.akshaykumbhar.coderswag.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.akshaykumbhar.coderswag.Model.Category
import com.akshaykumbhar.coderswag.R
import com.akshaykumbhar.coderswag.Service.Dataservice.categories
import kotlinx.android.synthetic.main.category_list.view.*


class CategoryRecycleAdapter(val context:Context,val categories:List<Category>,val itemClick:(Category)-> Unit):RecyclerView.Adapter<CategoryRecycleAdapter.Holder>(){
    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.Bindview(context,categories[position],itemClick)
    }

    override fun onCreateViewHolder(parent: ViewGroup ,viewType: Int): Holder{
        val v = LayoutInflater.from(context).inflate(R.layout.category_list,parent,false)
        return Holder(v)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

        inner class Holder(itemView : View) : RecyclerView.ViewHolder(itemView) {
            val categoryimage = itemView.findViewById<ImageView>(R.id.categoryimagr)
            val imagetext = itemView.findViewById<TextView>(R.id.categorytxt)

            fun Bindview(context:Context ,category: Category,itemClick: (Category)->Unit)
            {
                val resourceId = context.resources.getIdentifier(category.image, "drawable",context.packageName)
                categoryimage?.setImageResource(resourceId)
                imagetext?.text = category.title
                itemView.setOnClickListener{itemClick(category)}
            }
        }
}