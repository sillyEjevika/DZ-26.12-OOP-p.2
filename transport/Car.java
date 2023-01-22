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
    private Key key;

    public static class Key {
       private final boolean remoteEngineStart;



        private final boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }
        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return (remoteEngineStart ? "удаленный запуск двигателя" : "нет удалненного запуска двигателя") + ", " +
                            (keylessEntry ? "безключевой досутп" : "нет безключевого доступа");
        }
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

    public void setSummerTyres() {
        this.summerTyres = summerTyres;
    }
    public Key getKey() {
        return key;
    }
    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }


    public Car (String brand, String model, double engineVolume, String color, Integer year, String country, String transmission, String bodyType, String regNumber, boolean summerTyres, Key key) {
        String model1;
        this.brand = brand;
        model1 = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        this.summerTyres = summerTyres;
        if (model == null || model.isEmpty() || model == " ") {
            model1 = "default";
        }
        this.model = model1;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        if (color == null || color.isEmpty() || model == " ") {
            this.color = "белый";
        }
        if (year <= 0) {
            this.year = 2000;
        }
        if (transmission == null || transmission.isEmpty() || transmission == " ") {
            this.transmission = "мкпп";
        }
        if (bodyType == null || bodyType.isEmpty() || bodyType == " ") {
            this.bodyType = "хэчбэк";
        }
        if (regNumber == null || regNumber.isEmpty() || regNumber == " ") {
            this.regNumber = "z000zz178rus";
        }
        if (capacity <=0){
            this.capacity = 4;
        }
        setKey(key);
    }

    public void changeTyres(int month) {
        if ((month >= 10 && month <= 12) || (month >= 1 && month <= 4)) {
            summerTyres = false;
        }
        if (month >= 5 && month <= 9) {
            summerTyres = true;
        }
    }
    @Override
    public String toString() {
        return "Автомобиль: " +
                "марка: " + brand +
                ", модель: " + model +
                ", объем двигателя: " + engineVolume +
                ", цвет: " + color +
                ", год выпуска: " + year +
                ", страна производства: " + country +
                ", коробка передач: " + transmission +
                ", тип кузова: " + bodyType +
                ", регистрационный номер: " + regNumber +
                ", количество мест: " + capacity +
                ", резитна: " + (summerTyres?"летняя":"зимняя")+
                ", " + key;
    }
}