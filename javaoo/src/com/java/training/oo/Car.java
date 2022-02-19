package com.java.training.oo;


public class Car {

    private String  name;
    private String  brand;
    private Integer horsePower;
    private Integer maxSpeed;

    private Car() {

    }

    public static Car createInstance() {
        return new Car();
    }

    public String getName() {
        return this.name;
    }

    public Car setName(final String nameParam) {
        this.name = nameParam;
        return this;
    }

    public String getBrand() {
        return this.brand;
    }

    public Car setBrand(final String brandParam) {
        this.brand = brandParam;
        return this;
    }

    public Integer getHorsePower() {
        return this.horsePower;
    }

    public Car setHorsePower(final Integer horsePowerParam) {
        this.horsePower = horsePowerParam;
        return this;
    }

    public Integer getMaxSpeed() {
        return this.maxSpeed;
    }

    public Car setMaxSpeed(final Integer maxSpeedParam) {
        this.maxSpeed = maxSpeedParam;
        return this;
    }


}
