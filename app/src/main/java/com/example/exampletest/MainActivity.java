package com.example.exampletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 액티비티 또는 프래그먼트가 생성이 되었을 때 이곳에서 내부 구문들을 실행한다.
        Log.e("onCreate","ENTER");

        findViewById(R.id.btn_move).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SubActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart","ENTER");
        // 액티비티가 처음 시작할 때 onCreate -> onStart -> onResume 과정을 거친다.
    }

    @Override
    protected void onResume() {
        super.onResume();
        // 중지 되어있던 액티비티가 다시 재개(재실행) 되는 시점에서 이곳 내부 구문들을 실행한다.
        // onStart 되고 난 이후 사용자의 행동을 대기할 때도 onResume가 된다.
        Log.e("onResume","ENTER");
    }

    @Override
    protected void onPause() {
        super.onPause();
        /*
        중지 상태일 때 이곳 내부구문들을 실행
        중지상태란 홈버튼을 눌러서 바같을 잠깐 빠져나가거나
        다른 액티비티가 체인지 될 때를 말한다.
         */
        Log.e("onPause","ENTER");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop","ENTER");
        // onPause 다음에 호출되는데 onPause와 다른점은 onPause는 다른 액티비티로 넘어갈때 나오는 부분이고
        // onStop는 onPause되고 난 이후 기존 액티비티가 완전히 안보이는 상태를 의미한다.
        // 육안으로 확인하기에 왼전히 안보여야 한다. 만약 이동하는 액티비티가 반투명이라면 onPause까지만 호출된다.
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 화면이 파괴되어서 소멸했을 때의 시점 일때 이곳 구문을 실행한다.
        // ex) 뒤로가기 버튼을 눌렀을 때 보여지고 있던 액티비티는 파괴된다.
        Log.e("onDestroy","ENTER");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart","ENTER");
    }
}