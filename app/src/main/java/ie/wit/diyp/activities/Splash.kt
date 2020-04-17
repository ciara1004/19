package ie.wit.diyp.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import ie.wit.diyp.R
import ie.wit.diyp.main.DIYPApp


class Splash : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_splash)


        Handler().postDelayed({

            startActivity(Intent(this,DIYPApp::class.java))

            finish()
        }, SPLASH_TIME_OUT)
    }
}