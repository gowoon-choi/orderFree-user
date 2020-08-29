package com.example.orderfree_user.UI.login.data;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;

    @SerializedName("userName")
    private String userName;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getUserName() { return userName; }
}