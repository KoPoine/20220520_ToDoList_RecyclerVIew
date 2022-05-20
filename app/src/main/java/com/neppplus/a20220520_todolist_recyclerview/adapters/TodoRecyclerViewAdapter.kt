package com.neppplus.a20220520_todolist_recyclerview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.neppplus.a20220520_todolist_recyclerview.R
import com.neppplus.a20220520_todolist_recyclerview.models.TodoData

class TodoRecyclerViewAdapter(val mContext : Context, val mList : List<TodoData>) : RecyclerView.Adapter<TodoRecyclerViewAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val row = LayoutInflater.from(mContext).inflate(R.layout.todo_list_item, parent, false)
        return MyViewHolder(row)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    inner class MyViewHolder(view : View):RecyclerView.ViewHolder(view) {

    }
}