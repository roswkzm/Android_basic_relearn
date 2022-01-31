package com.example.exampletest;

// 사용자 계정 객체 생성
public class UserAccount {
    private String emailId;
    private String password;
    private String idToken;     // 고유 Uid


    public UserAccount() {
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }
}
