package com.example.multiplicationtables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView15;
    private TextView textView16;
    private TextView textView17;
    private TextView textView18;
    private TextView textView19;
    private TextView textView20;
    private TextView textView21;
    private TextView textView22;
    private TextView textView23;
    private TextView textView24;
    private TextView textView25;
    private EditText editTextNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView15 = findViewById(R.id.textView15);
        textView16 = findViewById(R.id.textView16);
        textView17 = findViewById(R.id.textView17);
        textView18 = findViewById(R.id.textView18);
        textView19 = findViewById(R.id.textView19);
        textView20 = findViewById(R.id.textView20);
        textView21 = findViewById(R.id.textView21);
        textView22 = findViewById(R.id.textView22);
        textView25 = findViewById(R.id.textView25);
        textView23 = findViewById(R.id.textView23);
        textView24 = findViewById(R.id.textView24);
        editTextNumber = findViewById(R.id.editTextNumber);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = editTextNumber.getText().toString();
                int n = Integer.parseInt(s);
                textView15.setText("The multiplication table is:");
                textView16.setText(n + " " + "X" + " " + "1" + " " + "=" + " " + n*1);
                textView17.setText(n + " " + "X" + " " + "2" + " " + "=" + " " + n*2);
                textView18.setText(n + " " + "X" + " " + "3" + " " + "=" + " " + n*3);
                textView19.setText(n + " " + "X" + " " + "4" + " " + "=" + " " + n*4);
                textView20.setText(n + " " + "X" + " " + "5" + " " + "=" + " " + n*5);
                textView21.setText(n + " " + "X" + " " + "6" + " " + "=" + " " + n*6);
                textView22.setText(n + " " + "X" + " " + "7" + " " + "=" + " " + n*7);
                textView25.setText(n + " " + "X" + " " + "8" + " " + "=" + " " + n*8);
                textView23.setText(n + " " + "X" + " " + "9" + " " + "=" + " " + n*9);
                textView24.setText(n + " " + "X" + " " + "10" + " " + "=" + " " + n*10);
//                for(int i = 0; i < 10; i++){
//                    int j = i + 1;
//                    textView3.setText(n + "X" + j + "=" + n*j + "\n");
//                }
                //textView3.setText("The multiplication table is:" + "\n");
                Toast.makeText(MainActivity.this, "Thanks for using this app", Toast.LENGTH_SHORT).show();
            }
        });
    }
}