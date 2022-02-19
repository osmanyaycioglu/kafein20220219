package com.java.training.oo;


public class CarImmutable {

    private final String  name;
    private final String  brand;
    private final Integer horsePower;
    private final Integer maxSpeed;

    private CarImmutable(final String nameParam,
                         final String brandParam,
                         final Integer horsePowerParam,
                         final Integer maxSpeedParam) {
        super();
        this.name = nameParam;
        this.brand = brandParam;
        this.horsePower = horsePowerParam;
        this.maxSpeed = maxSpeedParam;
    }

    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }

    public Integer getHorsePower() {
        return this.horsePower;
    }

    public Integer getMaxSpeed() {
        return this.maxSpeed;
    }

    public static CarImmutableBuilder builder() {
        return new CarImmutableBuilder();
    }

    public static class CarImmutableBuilder {

        private String  name;
        private String  brand;
        private Integer horsePower;
        private Integer maxSpeed;

        private CarImmutableBuilder() {
        }

        public String getName() {
            return this.name;
        }

        public CarImmutableBuilder setName(final String nameParam) {
            this.name = nameParam;
            return this;
        }

        public String getBrand() {
            return this.brand;
        }

        public CarImmutableBuilder setBrand(final String brandParam) {
            this.brand = brandParam;
            return this;
        }

        public Integer getHorsePower() {
            return this.horsePower;
        }

        public CarImmutableBuilder setHorsePower(final Integer horsePowerParam) {
            this.horsePower = horsePowerParam;
            return this;
        }

        public Integer getMaxSpeed() {
            return this.maxSpeed;
        }

        public CarImmutableBuilder setMaxSpeed(final Integer maxSpeedParam) {
            this.maxSpeed = maxSpeedParam;
            return this;
        }

        public CarImmutable build() {
            return new CarImmutable(this.name,
                                    this.brand,
                                    this.horsePower,
                                    this.maxSpeed);
        }

    }


}
