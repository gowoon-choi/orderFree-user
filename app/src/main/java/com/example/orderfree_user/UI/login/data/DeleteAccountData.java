package com.example.orderfree_user.UI.login.data;
import com.google.gson.annotations.SerializedName;

public class DeleteAccountData {
    @SerializedName("ownerEmail")
    private String ownerEmail;

    public DeleteAccountData(String ownerEmail) { this.ownerEmail = ownerEmail; }
}