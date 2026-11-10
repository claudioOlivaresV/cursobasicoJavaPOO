package POO;

public class Motorcycle extends  Vehiculo{
    private final Boolean hasSidecar;

    public Motorcycle(String brand, String model, Integer year, Boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }
    public void popWheelie() {
        System.out.println("esta haciendo willy");
    }

    @Override
    public void start() {
        System.out.println("La moto esta encendida");
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasSidecar=" + hasSidecar +
                '}' + super.toString();
    }
}
