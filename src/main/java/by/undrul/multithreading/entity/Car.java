package by.undrul.multithreading.entity;

import java.util.Objects;

public class Car extends Thread{
    private long carId;
    private CarType carType;

    public Car(CarType carType){
        this.carType = carType;
    }


    @Override
    public void run() {
        super.run();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carId == car.carId && carType == car.carType;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;

        result = result * prime + Long.hashCode(carId);
        result = result * prime + (carType!=null? carType.hashCode() : 0);

        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" Id: ").append(carId).append("  ");
        sb.append(" Car type: ").append(carType).append(";");
        return sb.toString();
    }
}
