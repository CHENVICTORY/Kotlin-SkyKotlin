package net.coocaa.skykotlin

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import net.coocaa.skykotlin.util.KLog

/**
 * 一个简单的登陆注册功能。
 */
class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "MainActivity"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewEvent()
    }

    override fun onResume() {
        super.onResume()
        KLog.d(TAG, "onResume")
    }

    private fun initViewEvent() {
        btn_login.setOnClickListener(mOnClickListener)
        btn_register.setOnClickListener(mOnClickListener)


    }


    private val mOnClickListener = View.OnClickListener() { view ->
        when (view.id) {
            R.id.btn_login -> {
                Log.d(TAG, "login: ")
            }
            R.id.btn_register -> {
                Log.d(TAG, "register: ")
            }
        }
    }
}