package com.akshaykumbhar.coderswag.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.akshaykumbhar.coderswag.Model.Category
import com.akshaykumbhar.coderswag.R
import kotlinx.android.synthetic.main.category_list.view.*

class categoryadpter(context: Context,categories: List<Category>) : BaseAdapter(){
    val context = context
    val categories = categories
    override fun getItem(postion: Int): Any {
        return categories[postion]
    }

    override fun getItemId(p0: Int): Long {
            return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    override fun getView(position:Int, convertView: View?, parent: ViewGroup?): View {
        val categoryview : View
        val holder : ViewHolder
        if(convertView == null) {
            categoryview = LayoutInflater.from(context).inflate(R.layout.category_list, null)
            holder = ViewHolder()
            holder.categoryimage = categoryview.findViewById(R.id.categoryimagr)
            holder.categoryname = categoryview.findViewById(R.id.categorytxt)
            categoryview.tag = holder
        }
        else
        {
           holder = convertView.tag as ViewHolder
            categoryview = convertView
        }
        val category = categories[position]
        val resourceid = context.resources.getIdentifier(category.image,"drawable",context.packageName)
        holder.categoryname?.text = category.title
        holder.categoryimage?.setImageResource(resourceid)
        return categoryview
    }
    private class ViewHolder {
        var categoryname : TextView? = null
        var categoryimage : ImageView? = null
    }
}