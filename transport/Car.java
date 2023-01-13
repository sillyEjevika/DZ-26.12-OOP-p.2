package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private Integer year;
    private final String country;
    private String transmission;
    private String bodyType;
    private String regNumber;
    private int capacity;
    boolean summerTyres;


    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public Car (String brand, String model, double engineVolume, String color, Integer year, String country ) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        if (color == null || color.isEmpty() || model.isBlank()) {
            this.color = "белый";
        }
        if (year <= 0) {
            this.year = 2000;
        }

    }
    @Override
    public String toString() {
        return "Автомобиль: " + "марка: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume + ", цвет: " + color + ", год выпуска: " + year + ", страна производства: " + country;
    }
}