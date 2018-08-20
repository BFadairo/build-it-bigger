package com.example.android.jokes;

import java.util.ArrayList;

public class JokeTeller {

    //For Future Use
    private static ArrayList<String> jokes = new ArrayList<>();

    public String getJoke() {
        int randNummber = (int) (Math.random() * 3);
        jokes.add("Guess what? Chicken Butt");
        jokes.add("What do you call fake pasta? Impasta");
        jokes.add("JOKES ON YOU");
        String joke = jokes.get(randNummber);
        return joke;
    }
}
