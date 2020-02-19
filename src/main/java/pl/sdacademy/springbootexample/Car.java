package pl.sdacademy.springbootexample;

import org.springframework.web.bind.annotation.GetMapping;

public class Car {
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }



    public int getSpeed() {
        return speed;
    }

}
