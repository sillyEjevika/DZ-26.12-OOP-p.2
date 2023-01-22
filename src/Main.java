import transport.Car;

public class Main {
    public static void main(String[] args) {
             // Задача №1
        System.out.println("Задача №1");
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "МКПП", "седан", "г123ма123rus", false, null);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "МКПП", "седан", "в123ма123rus", true, new Car.Key(false, true));
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия","АКПП", "купе", "л333ма23rus", true, new Car.Key(true, true));
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея","АКПП", "хэчбэк", "н555ма03rus", false, null);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,"Южная Корея"," ", " ", " ", false, new Car.Key(false, true));

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        }
}