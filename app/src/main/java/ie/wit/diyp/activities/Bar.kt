package ie.wit.diyp.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import ie.wit.diyp.R
import ie.wit.diyp.main.DIYPApp
import kotlinx.android.synthetic.main.content_default_bar.*


class Bar : AppCompatActivity() {
    lateinit var app: DIYPApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_default_bar)
        setSupportActionBar(toolbar)

        val barfoodButton = findViewById<Button>(R.id.barfoodButton)
        barfoodButton.setOnClickListener{
            val intent = Intent(this, Barfood::class.java)
            startActivity(intent)
        }

        val split = findViewById<Button>(R.id.split)
        split.setOnClickListener{
            val intent = Intent(this, Split::class.java)
            startActivity(intent)
        }

        val mixer = findViewById<Button>(R.id.mixer)
        mixer.setOnClickListener{
            val intent = Intent(this, Mixer::class.java)
            startActivity(intent)
        }

        val juice = findViewById<Button>(R.id.juice)
        juice.setOnClickListener{
            val intent = Intent(this, Juice::class.java)
            startActivity(intent)
        }

        val dash = findViewById<Button>(R.id.dash)
        dash.setOnClickListener{
            val intent = Intent(this, Dash::class.java)
            startActivity(intent)
        }

        val pint = findViewById<Button>(R.id.pint)
        pint.setOnClickListener{
            val intent = Intent(this, Pint::class.java)
            startActivity(intent)
        }

        val spirit = findViewById<Button>(R.id.spirit)
        spirit.setOnClickListener{
            val intent = Intent(this, Spirit::class.java)
            startActivity(intent)
        }

        val bottle = findViewById<Button>(R.id.bottle)
        bottle.setOnClickListener{
            val intent = Intent(this, Bottle::class.java)
            startActivity(intent)
        }

        val cocktail = findViewById<Button>(R.id.cocktail)
        cocktail.setOnClickListener{
            val intent = Intent(this, Cocktail::class.java)
            startActivity(intent)
        }

        val lc = findViewById<Button>(R.id.lc)
        lc.setOnClickListener{
            val intent = Intent(this, LC::class.java)
            startActivity(intent)
        }
    }
}

