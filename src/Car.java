public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    Integer year;
    String country;
    Car(String brand) {
        this.brand = brand;
    }

    Car (String brand,String model, double engineVolume, String color, Integer year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        if (model == null || model == " ") {
            this.model = "default";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        if (color == null || color == " ") {
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