import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
             // Задача №1
        System.out.println("Задача №1");
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 200, 2015, "Россия", "АКПП",  "седан", "г123ма123rus", false, null);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 320, 2020, "Германия", "МКПП", "седан", "в123ма123rus", true, new Car.Key(false, true));
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 0, 2021, "Германия","АКПП", "купе", "л333ма23rus", true, new Car.Key(true, true));
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 450, 2018, "Южная Корея","АКПП", "хэчбэк", "н555ма03rus", false, null);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", -100, 2016,"Южная Корея","", null, null, false, new Car.Key(false, true));
        Bus volvo = new Bus("Volvo", "x090x", 2020, "Швеция", "розовый", 220);
        Bus iveco = new Bus("Iveco", "transit", 2018, "Южная Корея", "синий", 150);
        Bus vagen = new Bus("Volkswagen", "transponder", 2000, "Германия", "черный", 180);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println(volvo);
        System.out.println(iveco);
        System.out.println(vagen);
        }
}