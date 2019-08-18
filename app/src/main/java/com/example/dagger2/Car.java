package com.example.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Car {


    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    @Inject
    Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    void drive() {
        Log.d(TAG, "driving...");
    }
}
