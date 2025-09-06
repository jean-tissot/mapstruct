package org.mapstruct.ap.test.inheritfromconfig;

/**
 * @author Jean Tissot
 */
public class DriverWithCarDto extends DriverDto {
    private CarDto car;

    public CarDto getCar() {
        return car;
    }

    public void setCar(CarDto car) {
        this.car = car;
    }
}
