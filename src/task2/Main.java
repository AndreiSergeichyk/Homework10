package task2;

public class Main {

    public static void main(String[] args) {

        Garage garage = new Garage();
        Car bmw = new BMW("x6", 2001, 5.0, true, "black");
        Car bmw2 = new BMW("x6", 2001, 5.0, true, "black");
        Car volk = new Volkswagen("passat", 2005, 2.0, false, false);
        Car toyota = new Toyota("rav4", 2003, 1.2, true, true);
        Car geely = new Geely("xc7", 2000, 1.8, false, 15000);
        Car geely2 = new Geely("xc7", 2000, 1.8, false,15000);
        Car geely3 = new Geely("xc7", 2000, 1.8, false,15000);

        garage.parking(bmw);
        garage.parking(bmw2);
        garage.parking(volk);
        garage.parking(toyota);
        garage.parking(geely);
        garage.parking(geely2);
        garage.parking(geely3);

        System.out.println(garage.countCarInGarage(geely));
        garage.cheekOutCar(geely);
        System.out.println(garage.countCarInGarage(geely));
    }
}
