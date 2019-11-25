package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonCalculate.setOnClickListener(){
            var weight: Double = txtWeight.text.toString().toDouble()
            var height: Double = txtHeight.text.toString().toDouble()

            var BMI: Double = weight / (height * height)




            if(BMI < 18.5)
            {
                imageView.setImageResource(R.drawable.under)
                textView5.text = "BMI: %.1f UnderWeight".format(BMI)
            }
            else if(BMI>= 18.5 && BMI<=24.9)
            {
                imageView.setImageResource(R.drawable.normal)
                textView5.text = "BMI: %.1f Normal".format(BMI)
            }
            else if(BMI> 24.9)
            {
                imageView.setImageResource(R.drawable.over)
                textView5.text = "BMI: %.1f OverWeight".format(BMI)
            }
        }

        buttonReset.setOnClickListener(){
            txtHeight.text = null;
            txtWeight.text = null;

            textView5.text = "BMI: "
            imageView.setImageResource(R.drawable.empty)
        }
    }


}
