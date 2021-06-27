package com.example.contacts2021;

import android.app.Application;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;

import java.util.List;

public class ApplicationClass extends Application {
    public static final String APPLICATION_ID = "316C3855-5D94-973E-FF70-85AE7F423E00";
    public static final String API_KEY = "A9D9AFD6-02B0-47C5-AF25-EE570533B913";
    public static final String SERVER_URL = "https://eu-api.backendless.com";

    public static BackendlessUser user;
    public static List<Contact> contacts;

    @Override
    public void onCreate() {
        super.onCreate();
        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );
    }
}
