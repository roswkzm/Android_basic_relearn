package com.example.exampletest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private CheckBox chk_red, chk_blue, chk_green;
    private TextView tv_result;
    private Button btn_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chk_red = findViewById(R.id.chk_red);
        chk_blue = findViewById(R.id.chk_blue);
        chk_green = findViewById(R.id.chk_green);
        tv_result = findViewById(R.id.tv_result);
        btn_result = findViewById(R.id.btn_result);

        btn_result.setOnClickListener(new View.OnClickListener() {      //선택완료 버튼 눌렀을시
            @Override
            public void onClick(View view) {
                String str_result = "";     // 버튼 눌렀을때마다 결과값 초기화
                if (chk_red.isChecked()){
                    str_result = str_result + chk_red.getText().toString();
                }
                if (chk_blue.isChecked()){
                    str_result = str_result + chk_blue.getText().toString();
                }
                if (chk_green.isChecked()){
                    str_result = str_result + chk_green.getText().toString();
                }

                tv_result.setText(str_result);
            }
        });
    }
}