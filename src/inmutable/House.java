package inmutable;

public final class House {
    private  final Integer doors;
    private  final Integer windows;
    private  final Double size;

    public House(Integer doors, Integer windows, Double size) {
        this.doors = doors;
        this.windows = windows;
        this.size = size;
    }

    public Integer getDoors() {
        return doors;
    }

    public Integer getWindows() {
        return windows;
    }

    public Double getSize() {
        return size;
    }
}
