package com.neppplus.a20220520_todolist_recyclerview.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.neppplus.a20220520_todolist_recyclerview.R
import com.neppplus.a20220520_todolist_recyclerview.adapters.TodoRecyclerViewAdapter
import com.neppplus.a20220520_todolist_recyclerview.models.TodoData
import kotlinx.android.synthetic.main.fragment_todo.*

class TodoFragment : Fragment(){

    var todoList = ArrayList<TodoData>()

    lateinit var mTodoAdapter : TodoRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_todo, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupEvents()
        setValues()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (todoList.isEmpty()) {
            todoList.add( TodoData(4.5, "오늘 수업 수강하기", "neppPlus 학원", false) )
            todoList.add( TodoData(4.0, "오늘 수업 복습하기", "집", false) )
            todoList.add( TodoData(3.5, "오늘 수업 출석하기", "neppPlus 학원", true) )
            todoList.add( TodoData(3.0, "오늘 수업 수강하기", "neppPlus 학원", false) )
            todoList.add( TodoData(2.5, "오늘 수업 수강하기", "neppPlus 학원", false) )
        }
    }

    fun setupEvents() {

    }

    fun setValues() {
        mTodoAdapter = TodoRecyclerViewAdapter(requireContext(), todoList)
        todoRecyclerView.adapter = mTodoAdapter
        todoRecyclerView.layoutManager = LinearLayoutManager(requireContext())
    }
}