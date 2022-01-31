package com.example.exampletest;


import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private UserDao mUserDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserDatabase database = Room.databaseBuilder(getApplicationContext(), UserDatabase.class, "WhereU")
                .fallbackToDestructiveMigration()       // 스키마(DB) 버전 변경 가능
                .allowMainThreadQueries()       // Main Thread에서 DB에 입출력을 가능하게함
                .build();

        mUserDao = database.userDao();      // 인터페이스 객체 할당

//        // 데이터 삽입
//        User user = new User();     // 새로운 유저 인스턴스 생성
//        user.setName("이진영");
//        user.setAge("20");
//        user.setPhoneNumber("01023685287");
//        mUserDao.setInsertUser(user);

        List<User> userList = mUserDao.getUserAll();

        // 데이터 조회
        for (int i = 0; i < userList.size(); i++){
            Log.d("TEST", userList.get(i).getName() + "\n"
            + userList.get(i).getAge() + "\n"
            + userList.get(i).getPhoneNumber() + "\n");
        }


//        // 데이터 수정
//        User user2 = new User();     // 새로운 유저 인스턴스 생성
//        user2.setId(1);
//        user2.setName("이진영이진");
//        user2.setAge("20여1");
//        user2.setPhoneNumber("01023685288");
//        mUserDao.setUpdateUser(user2);

        // 데이터 삭제
        User user3 = new User();
        user3.setId(2);
        mUserDao.setDeleteUser(user3);
    }
}