package com.j.ming.eupanbasesupport

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.j.ming.easyrefresh.EasyRefreshFooter
import com.j.ming.easyrefresh.EasyRefreshLayout
import com.j.ming.easyrefresh.arrow.ArrowRefreshHeader
import kotlinx.android.synthetic.main.activity_easy_refresh_test.*

class EasyRefreshTest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_easy_refresh_test)
        initView()
    }

    private fun initView() {
        //设置数据充满布局才允许上拉加载更多
        refreshLayout.setLoadOnlyDataFullScreen(true)
        //设置头布局
        val easyRefreshHeaderHandler = ArrowRefreshHeader(R.layout.easy_refresh_header)
        refreshLayout.setHeader(easyRefreshHeaderHandler)
        //设置尾布局
        val easyRefreshFooterHandler = EasyRefreshFooter(R.layout.easy_refresh_footer)
        refreshLayout.setFooter(easyRefreshFooterHandler)

        refreshLayout.setOnRefreshListener(object : EasyRefreshLayout.OnRefreshListener{
            override fun onRefresh() {
                refreshLayout.postDelayed({
                    refreshLayout.closeRefresh()
                }, 1000)
            }

        })
        refreshLayout.setOnLoadListener(object : EasyRefreshLayout.OnLoadListener{
            override fun onLoad() {
                refreshLayout.postDelayed({
                    refreshLayout.closeLoad()
                }, 1000)
            }

        })
    }
}
