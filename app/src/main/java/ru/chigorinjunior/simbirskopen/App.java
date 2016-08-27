package ru.chigorinjunior.simbirskopen;

import com.firebase.client.Firebase;

public class App extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
