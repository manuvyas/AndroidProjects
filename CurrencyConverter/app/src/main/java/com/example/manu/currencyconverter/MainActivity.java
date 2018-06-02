package com.example.manu.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convertToUSD(View view){

        EditText amountInRs=(EditText) findViewById(R.id.currencyInputBox);
        String temp_string = amountInRs.getText().toString();
        Double amountinRSDouble = Double.parseDouble(temp_string);
        //Float amountinRsFloat=Float.parseFloat(temp_string);
        Double amountinUSDDouble=amountinRSDouble/70;

        TextView convertedValue=(TextView) findViewById(R.id.convertedValue);
        convertedValue.setText(amountinUSDDouble.toString());

        Toast.makeText(this, "amount in USD is " + amountinUSDDouble.toString(),Toast.LENGTH_SHORT).show();
        //Toast.makeText(this,"Hello",Toast.LENGTH_SHORT).show();
        Log.i("info","Convert button pressed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
