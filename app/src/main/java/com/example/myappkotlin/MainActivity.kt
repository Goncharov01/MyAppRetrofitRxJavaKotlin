package com.example.myappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import com.example.myappkotlin.Retrofit.RetrofitClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       progressBar.visibility = ProgressBar.GONE

        Btwo.setVisibility(View.GONE)



        checkBox.setOnClickListener(View.OnClickListener {
            if (checkBox.isChecked) {
                Btwo.setVisibility(View.VISIBLE)
            } else {
                Btwo.setVisibility(View.GONE)
            }
        })





//        checkBox.setOnClickListener(OnClickListener)
//
//        var onClickListener: View.OnClickListener = View.OnClickListener { v ->
//            when (v.id) {
//                R.id.checkBox -> if (checkBox.isChecked) {
//                    Btwo.setVisibility(View.VISIBLE)
//                } else {
//                    Btwo.setVisibility(View.GONE)
//                }
//            }
//        }


        Btwo.setOnClickListener(){
            intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("name",editName.text.toString())
            intent.putExtra("lastName",editLastName.text.toString())
                progressBar.visibility = ProgressBar.VISIBLE
            startActivity(intent)


        }

    }

}
