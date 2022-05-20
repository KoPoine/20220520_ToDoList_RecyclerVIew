package com.neppplus.a20220520_todolist_recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.neppplus.a20220520_todolist_recyclerview.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mPagerAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    private fun setupEvents() {

    }

    private fun setValues() {
        mPagerAdapter = MainViewPagerAdapter(this)
        mainViewPage.adapter = mPagerAdapter
    }
}