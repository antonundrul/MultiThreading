package by.undrul.multithreading.entity;

public enum CarType {
    PASSENGER_CAR(7,1500),
    FREIGHT_CAR(33,37000);

    private int area;
    private int weight;

    CarType(int area, int weight) {
        this.area = area;
        this.weight = weight;
    }

    public int getArea() {
        return area;
    }

    public int getWeight() {
        return weight;
    }


}
