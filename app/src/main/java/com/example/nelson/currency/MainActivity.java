package com.example.nelson.currency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;


import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onclicked_convertir(View view){
        EditText editText1 = findViewById(R.id.editText1); //obtengo el edit text
        TextView textView1 = findViewById(R.id.textView2);

        RadioButton radioButton1 = findViewById(R.id.radioButton1);
        RadioButton radioButton2 = findViewById(R.id.radioButton2);
        String cantidadDinero =  editText1.getText().toString();
        double moneda = Float.parseFloat(cantidadDinero);
        String resultado;




        if(radioButton1.isChecked()){
            NumberFormat format = NumberFormat.getCurrencyInstance(Locale.getDefault());
            format.setCurrency(Currency.getInstance("USA"));
            resultado = format.format(moneda/572.83);
            textView1.setText(resultado);

            //resultado = Integer.toString(moneda/572);
        }else{
            NumberFormat format = NumberFormat.getCurrencyInstance(Locale.getDefault());
            format.setCurrency(Currency.getInstance("CRC"));
            resultado = format.format(moneda*566.56);
            textView1.setText(resultado);

            //resultado = Integer.toString(moneda*566);
        }
    }


    /*public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton1:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.radioButton2:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }*/
}
