package com.example.lenovo.redbarmolo;
/**
 * Created by Lenovo on 04.11.2016.
 */

public class Drink {
    private String name;
    private int imageResourceId;

    public static final Drink[] drinks = new Drink[]{
            new Drink("Whisky", R.drawable.whisky),
            new Drink("Martini", R.drawable.martini)
    };

    private Drink(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}