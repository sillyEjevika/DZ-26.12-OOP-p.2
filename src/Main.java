import transport.Car;

public class Main {
    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1");

        Car lada1 = new Car("Lada");
        lada1.setModel("Granta");
        lada1.setEngineVolume(1.7);
        lada1.setColor("желтый");
        lada1.setYear(2015);
        lada1.setCountry("Россия");
        System.out.println(lada1);

        Car audi1 = new Car("Audi");
        audi1.setModel("A8 50 L TDI quattro");
        audi1.setEngineVolume(3.0);
        audi1.setColor("черный");
        audi1.setYear(2020);
        audi1.setCountry("Германия");
        System.out.println(audi1);

        Car bmw1 = new Car("BMW");
        bmw1.setModel("Z8");
        bmw1.setEngineVolume(3.0);
        bmw1.setColor("черный");
        bmw1.setYear(2021);
        bmw1.setCountry("Германия");
        System.out.println(bmw1);

        Car kia1 = new Car("Kia");
        kia1.setModel("Sportage 4-го поколения");
        kia1.setEngineVolume(2.4);
        kia1.setColor("красный");
        kia1.setYear(2018);
        kia1.setCountry("Южная Корея");
        System.out.println(kia1);

        Car hyundai1 = new Car("Hyundai");
        hyundai1.setModel("Avante");
        hyundai1.setEngineVolume(1.6);
        hyundai1.setColor("оранжевый");
        hyundai1.setYear(2016);
        hyundai1.setCountry("Южная Корея");
        System.out.println(hyundai1);

        // Задача №2
        System.out.println("Задача №2");
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,"Южная Корея");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        // Задача №3
        System.out.println("Задача №3");
        Car lada2 = new Car("Lada", null, -2, "", -22, "Россия");
        Car audi2 = new Car("Audi", " ", 0,  null, 0, "Германия");
        Car bmw2 = new Car("BMW", null, -1.7, " ", -2021, "Германия");
        Car kia2 = new Car("Kia", " ", -2.4, " ", 0, "Южная Корея");
        Car hyundai2 = new Car("Hyundai", null, 0, null, -2016,"Южная Корея");

        System.out.println(lada2);
        System.out.println(audi2);
        System.out.println(bmw2);
        System.out.println(kia2);
        System.out.println(hyundai2);
    }

}