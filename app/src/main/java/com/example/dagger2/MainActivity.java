package com.example.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Engine engine = new Engine();
//        Wheels wheels = new Wheels();
//        Car car = new Car(engine, wheels);
        CarComponent component = DaggerCarComponent.create();
//        car = component.getCar();
        component.inject(this);
        car.drive();
    }
}
