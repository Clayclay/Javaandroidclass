package fr.polweb.www.javaandroidclass

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View

import android.widget.Button

import android.view.MotionEvent
import android.view.View.OnTouchListener
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.CheckBox
import android.widget.TextView
import android.widget.RadioGroup




class MainActivity : AppCompatActivity() {

    private val defaut = "Vous devez cliquer sur le bouton « Calculer l'IMC » pour obtenir un résultat."

    // La chaîne de caractères de la megafonction

    private val megaString = "Vous faites un poids parfait ! Wahou ! Trop fort ! On dirait Brad Pitt (si vous êtes un homme)/Angelina Jolie (si vous êtes une femme)/Willy (si vous êtes un orque) !"


    var imc : Button? = null
    var raz: Button? = null

    var nbrpoids : EditText?=null
    var taille : EditText?=null

    var radioGroup: RadioGroup? = null
    var result: TextView? = null
    var mega: CheckBox? = null

    //var b3: Button? = null




    private val clickListenerBoutons = View.OnClickListener { /* Réagir au clic pour les boutons 1 et 2*/ }


    private val touchListenerBouton1 = object : View.OnTouchListener {

        override fun onTouch(v: View, event: MotionEvent): Boolean {

            return onTouch(v, event)

        }

    }


    private val touchListenerBouton3 = OnTouchListener { v, event ->

        super.onTouchEvent( event)
    }






    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




// Le Listener de txt
        taille?.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
               // tvSample.setText("Text in EditText : "+s)
            }
        })


       nbrpoids?.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                // tvSample.setText("Text in EditText : "+s)
            }
        })




// Bouton
        var imc = findViewById(R.id.IMC) as Button;
        var raz = findViewById(R.id.raz) as Button;



                imc.setOnTouchListener(touchListenerBouton1);
               imc.setOnClickListener(clickListenerBoutons)

                   // poids/(taille²)

                ;

               raz.setOnClickListener(clickListenerBoutons);


                //b3.setOnTouchListener(touchListenerBouton3);

        }
//fin Bouton




    }

