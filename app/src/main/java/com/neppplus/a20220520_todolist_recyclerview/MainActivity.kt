package com.neppplus.a20220520_todolist_recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
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

//        바텀 네이게이션 클릭 이벤트 처리
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> mainViewPage.currentItem = 0
                R.id.paper -> mainViewPage.currentItem = 1
                R.id.profile -> mainViewPage.currentItem = 2
            }
            return@setOnItemSelectedListener true
        }

//        뷰 페이저 연결
        mainViewPage.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                bottomNav.menu.getItem(position).isChecked = true
            }
        })
    }
}















