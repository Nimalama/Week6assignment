package com.nima.week6softuseractivity.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

import com.nima.week6softuseractivity.R
import com.nima.week6softuseractivity.ui.home.HomeFragment


class Adapter(var lst: ArrayList<com.nima.week6softuseractivity.Class.Person>, val dsf: HomeFragment):RecyclerView.Adapter<Adapter.AdapterViewHolder>() {

    class AdapterViewHolder(view: View):RecyclerView.ViewHolder(view){

        var name:TextView
        var batch:TextView
        var gender:TextView
        var address:TextView
        var del:ImageButton
        var img: ImageView
        init{

            name = view.findViewById(R.id.name)
            batch = view.findViewById(R.id.batch)
            gender = view.findViewById(R.id.gender)
            address = view.findViewById(R.id.address)
            del = view.findViewById(R.id.del)
            img = view.findViewById(R.id.imageView)
        }




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.mero_view,parent,false)
        return AdapterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lst.size
    }

    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {
        val student = lst[position]

        holder.name.text =student.fname +" "+student.lname
        holder.batch.text = student.batch
        holder.address.text = student.address
        holder.gender.text = student.gender
        Glide.with(holder.itemView.context).load(student.image).into(holder.img)


        holder.del.setOnClickListener(){
            delete(lst,position)
        }


    }

    fun delete(person: ArrayList<com.nima.week6softuseractivity.Class.Person>, position: Int)
    {
        person.removeAt(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, person.size);

    }
}