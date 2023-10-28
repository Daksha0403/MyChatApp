package com.example.chatapp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.chatapp.databinding.ActivityUserprofileBinding;

public class userprofile {
    public String username,userUID;
    public userprofile()
    {

    }

    public userprofile(String username,String userUID)
    {
        this.username = username;
        this.userUID = userUID;
    }

    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getUserUID()
    {
        return userUID;
    }
    public void setUserUID(String userUID)
    {
        this.userUID = userUID;
    }
}