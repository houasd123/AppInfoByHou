package com.appinfodb.pojo;

import java.io.Serializable;

public class LoginUser implements Serializable {
    private String userCode;
    private String userPassword;
    private String userName;

    public LoginUser() {
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "userCode='" + userCode + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public LoginUser(String userCode, String userPassword, String userName) {
        this.userCode = userCode;
        this.userPassword = userPassword;
        this.userName = userName;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LoginUser(String userCode, String userPassword) {
        this.userCode = userCode;
        this.userPassword = userPassword;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
