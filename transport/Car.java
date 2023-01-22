package transport;

public class Car extends Transport {
    private double engineVolume;
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

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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


    public Car (String brand, String model, double engineVolume, String color, int maxSpeed, int year, String country, String transmission, String bodyType, String regNumber, boolean summerTyres, Key key) {
        super (brand, model, year, country, color, maxSpeed);
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
        this.summerTyres = summerTyres;
        if (transmission == null || transmission.isEmpty() || transmission == " ") {
            this.transmission = "мкпп";
        }
        this.transmission = transmission;
        if (bodyType == null || bodyType.isEmpty() || bodyType == " ") {
            this.bodyType = "хэчбэк";
        }
        this.bodyType = bodyType;
        if (regNumber == null || regNumber.isEmpty() || regNumber == " ") {
            this.regNumber = "z000zz178rus";
        }
        this.regNumber = regNumber;
        if (capacity <=0){
            this.capacity = 4;
        }
        this.capacity = capacity;
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
        return super.toString() +
                ", объем двигателя: " + engineVolume +
                ", коробка передач: " + transmission +
                ", тип кузова: " + bodyType +
                ", регистрационный номер: " + regNumber +
                ", количество мест: " + capacity +
                ", резитна: " + (summerTyres?"летняя":"зимняя")+
                ", " + key;
    }
}