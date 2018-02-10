package task2;

public class Volkswagen extends Car {

    private boolean universal;

    public Volkswagen(String model, int year, double capacity, boolean automaticTransmission, boolean universal) {
        super(CarType.VOLKSWAGEN.getType(), model, year, capacity, automaticTransmission);
        this.universal = universal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Volkswagen that = (Volkswagen) o;

        return universal == that.universal;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (universal ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Volkswagen{" +
                "universal=" + universal +
                "} " + super.toString();
    }
}
