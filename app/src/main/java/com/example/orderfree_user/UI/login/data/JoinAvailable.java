package com.example.orderfree_user.UI.login.data;

import com.google.gson.annotations.SerializedName;

public class JoinAvailable {
    @SerializedName("userEmail")
    private String userEmail;

    public JoinAvailable(String userEmail){
        this.userEmail = userEmail;
    }
}
