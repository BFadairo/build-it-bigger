package com.udacity.gradle.builditbigger.backend;

import com.example.android.jokes.JokeTeller;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        return myData;
    }

    public String getJokeData() {
        JokeTeller jokeTeller = new JokeTeller();
        myData = jokeTeller.getJoke();
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }

}