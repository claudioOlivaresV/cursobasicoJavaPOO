package POO;

public class Car  extends Vehiculo {
    private Integer doors;

    public Car(String brand, String model, Integer year, Integer doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    @Override
    public void start() {
        System.out.println("el auto esta encendido");
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }
}
