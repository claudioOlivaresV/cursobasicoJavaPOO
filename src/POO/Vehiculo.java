package POO;

public class Vehiculo {
    private String brand;
    private String model;
    private Integer year;

    public Vehiculo(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("Encender");
    }
    public void start(Boolean silentMode) {
        if(silentMode) {
            System.out.println("Encender silencioso");
        } else  {
            start();
        }
    }
    public void stop() {
        System.out.println("parar");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        int currentYear = java.time.Year.now().getValue();
        if (year < 1886 || year > currentYear + 2) {
            throw new IllegalArgumentException("Año invalido");
        }
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
