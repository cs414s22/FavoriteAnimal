package com.example.favoriteanimal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun radioButtonClick(view: View) {
        // check which radio button was clicked -- 'when' in Kotlin is like 'switch' in Java
        val idOfSelectedImage = when (view) {
            dog -> R.drawable.dog
            cat -> R.drawable.cat
            bear -> R.drawable.bear
            else -> R.drawable.rabbit
        }
        // Set the id of the selected image to the image View
        image_animal.setImageResource(idOfSelectedImage)



        // The same functionality can be achieved using if else statements instead of when as follows:
        /*if(view == dog){
            image_animal.setImageResource(R.drawable.dog)
            Toast.makeText(this, "You selected dog", Toast.LENGTH_SHORT).show()
        }
        else if(view == cat){
            image_animal.setImageResource(R.drawable.cat)
            Toast.makeText(this, "You selected cat", Toast.LENGTH_SHORT).show()
        }
        else if(view == bear){
            image_animal.setImageResource(R.drawable.bear)
            Toast.makeText(this, "You selected bear", Toast.LENGTH_SHORT).show()
        }
        else if(view == rabbit){
            image_animal.setImageResource(R.drawable.rabbit)
            Toast.makeText(this, "You selected rabbit", Toast.LENGTH_SHORT).show()
        }*/
    }
}