package model;

public class Car {
    private String maker;
    private String model;
    private int year;
    private String licensePlate;
    private int rentPerDay;
    private boolean isAvailable;


    public Car(String maker, String model, int year, String licensePlate, int rentPerDay, boolean isAvailable) {
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
        this.rentPerDay = rentPerDay;
        this.isAvailable = isAvailable;
    }

    public String getMaker() {
        return this.maker;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public int getRentPerDay() {
        return this.rentPerDay;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
