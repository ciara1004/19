package ie.wit.diyp.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import ie.wit.diyp.R
import ie.wit.diyp.main.DIYPApp
import kotlinx.android.synthetic.main.content_default_bar.*

class Cocktail : AppCompatActivity() {
    lateinit var app: DIYPApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_cocktail)
        setSupportActionBar(toolbar)

        val barButton = findViewById<Button>(R.id.barButton)
        barButton.setOnClickListener{
            val intent = Intent(this, Bar::class.java)
            startActivity(intent)
        }

        val barfoodButton = findViewById<Button>(R.id.barfoodButton)
        barfoodButton.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        val defaultMenu = findViewById<Button>(R.id.defaultMenu)
        defaultMenu.setOnClickListener{
            val intent = Intent(this, Bar::class.java)
            startActivity(intent)
        }
    }
}