import POO.Car;
import POO.Motorcycle;
import POO.Vehiculo;
import inmutable.House;

public  class Main {
    static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Fiat", "Duna", 2000);
        vehiculo.setYear(2022);
        String data = vehiculo.toString();
        System.out.println(data);

        House house = new House(2, 2, 199.9);
        System.out.println(house.getDoors());

        Car car = new Car("toyota", "corrolla", 2011, 3);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2021, false);

        car.start();
        motorcycle.start();
    }
}