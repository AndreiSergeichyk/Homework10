package task2;

public class BMW extends Car {

    private String coler;

    public BMW(String model, int year, double capacity, boolean automaticTransmission, String coler) {
        super(CarType.BMW.getType(), model, year, capacity, automaticTransmission);
        this.coler = coler;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BMW bmw = (BMW) o;

        return coler != null ? coler.equals(bmw.coler) : bmw.coler == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (coler != null ? coler.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "coler='" + coler + '\'' +
                "} " + super.toString();
    }
}
