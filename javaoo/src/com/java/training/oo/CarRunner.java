package com.java.training.oo;

public class CarRunner {

    public static void main(final String[] args) {
        //        Car carLoc = new Car("BMW",
        //                             "320i",
        //                             150,
        //                             200);

        Car carLoc = Car.createInstance()
                        .setName("BMW")
                        .setBrand("320i")
                        .setMaxSpeed(200)
                        .setHorsePower(150);

        CarImmutable carImmutableLoc = CarImmutable.builder()
                                                   .setName("BMW")
                                                   .setBrand("320i")
                                                   .setHorsePower(150)
                                                   .setMaxSpeed(200)
                                                   .build();


    }
}
