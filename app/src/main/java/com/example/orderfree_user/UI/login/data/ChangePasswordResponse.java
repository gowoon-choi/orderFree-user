package com.example.orderfree_user.UI.login.data;

import com.google.gson.annotations.SerializedName;

public class ChangePasswordResponse {
    @SerializedName("code")
    private int code;

    public int getCode(){return code;}
}
