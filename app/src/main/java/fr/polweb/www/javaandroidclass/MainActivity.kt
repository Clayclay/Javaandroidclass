package fr.polweb.www.javaandroidclass

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {



    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // On récupère notre layout par désérialisation. La méthode inflate retourne un View
        // C'est pourquoi on caste (on convertit) le retour de la méthode avec le vrai type de notre layout, c'est-à-dire RelativeLayout

     //   RelativeLayout.inflate(this, R.layout.activity_main, null) as RelativeLayout



        // … puis on récupère TextView grâce à son identifiant


        val editText = EditText(this)

        editText.setHint(R.string.editText)

        editText.inputType = InputType.TYPE_TEXT_FLAG_MULTI_LINE

        editText.setLines(5)

poids.setTextColor(#2222)









        setContentView(R.layout.activity_main)


    }
}
