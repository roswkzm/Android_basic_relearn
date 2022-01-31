package com.example.exampletest;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

/**
 * Data Access Object
 */
@Dao
public interface UserDao {

    @Insert // 삽입
    void setInsertUser(User user);

    @Update // 수정
    void setUpdateUser(User user);

    @Delete // 삭제
    void setDeleteUser(User user);

    // 조회 쿼리
    @Query("SELECT * FROM USER")      // 쿼리는 DB에 요청하는 명령문
    List<User> getUserAll();
}
