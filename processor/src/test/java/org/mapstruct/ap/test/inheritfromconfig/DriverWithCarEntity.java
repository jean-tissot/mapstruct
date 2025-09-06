package org.mapstruct.ap.test.inheritfromconfig;

/**
 * @author Jean Tissot
 */
public class DriverWithCarEntity {

    private String driverName;

    private CarEntity car;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public CarEntity getCar() {
        return car;
    }

    public void setCar(CarEntity car) {
        this.car = car;
    }
}
