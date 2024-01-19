package com.example.test

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class personAdapter(private val list: List<person>) : RecyclerView.Adapter<personAdapter.personHolder>() {
    class personHolder(inflater: LayoutInflater,parent: ViewGroup)
        :RecyclerView.ViewHolder(inflater.inflate(R.layout.single_view,parent,false)) {
        val txtFirstName : TextView = itemView.findViewById(R.id.firstName)
        val txtLastName : TextView = itemView.findViewById(R.id.lastName)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): personHolder {
        val inflater = LayoutInflater.from(parent.context)
        return personHolder(inflater,parent)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: personHolder, position: Int) {
        val person : person = list[position];
        holder.txtFirstName.text = person.firstName
        holder.txtLastName.text = person.lastName

        holder.itemView.setOnClickListener {
            val i = Intent(it.context,detailActivity::class.java);
            i.putExtra("firstName",person.firstName)
            i.putExtra("lastName",person.lastName)
            i.putExtra("email",person.email)
            i.putExtra("age",person.age)

            it.context.startActivity(i);
        }
    }
}