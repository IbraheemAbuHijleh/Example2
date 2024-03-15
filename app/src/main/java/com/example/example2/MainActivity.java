package com.example.example2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txthob;
    private Button btnsave;

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txthob=findViewById(R.id.texthob);
        btnsave=findViewById(R.id.btnsave);
        editText=findViewById(R.id.edithobbise);


        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Show=editText.getText().toString();

                if(!Show.isEmpty()){
                   txthob.setText(Show);
                    txthob.setVisibility(View.VISIBLE);
                }

            }
        });
    }


}