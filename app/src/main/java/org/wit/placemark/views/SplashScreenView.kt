package org.wit.placemark.views

import android.content.Intent
import android.os.Bundle
import org.jetbrains.anko.AnkoLogger
import org.wit.placemark.R
import org.wit.placemark.views.login.LoginView
import java.lang.Exception

class SplashScreenView : BaseView(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)


        val background = object : Thread(){
            override fun run() {
                try{
                    Thread.sleep(5000)

                    val intent = Intent(baseContext, LoginView::class.java)
                    startActivity(intent)
                } catch (e: Exception){
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}
