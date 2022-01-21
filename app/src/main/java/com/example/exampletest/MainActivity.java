package com.example.exampletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_text;
    private Button btn_test;
    private Button btn_move;
    private String str;
    private ImageView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_text = findViewById(R.id.et_text);
        btn_test = findViewById(R.id.btn_test);
        btn_move = findViewById(R.id.btn_move);
        test = findViewById(R.id.test);

        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = et_text.getText().toString();
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
               intent.putExtra("str",str);
                startActivity(intent);  //엑티비티 이동
            }
        });

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"이진영이진영이진영이진영",Toast.LENGTH_SHORT).show();
            }
        });
    }
}