package com.example.orderfree_user.UI.mainview.data;

import com.google.gson.annotations.SerializedName;

public class CheckPasswordResponse {
    @SerializedName("code")
    private int code;

    public int getCode(){return code;}
}
