package gr.aueb.cf.cf9.ch17.lifo_parking;

public class Main {

    public static void main(String[] args) {

        LifoParking parking = new LifoParking();

        parking.addCar("IYY 7977");
        parking.addCar("IKI 5068");
        parking.addCar("IMH 1552");

        String car = parking.removeCar();
        System.out.println(car);

        car = parking.removeCar();
        System.out.println(car);

    }
}
