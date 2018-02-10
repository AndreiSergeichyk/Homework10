package task2;

public class Geely extends Car {

    private int cost;

    public Geely(String model, int year, double capacity, boolean automaticTransmission, int cost) {
        super(CarType.GEELY.getType(), model, year, capacity, automaticTransmission);
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Geely geely = (Geely) o;

        return cost == geely.cost;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + cost;
        return result;
    }

    @Override
    public String toString() {
        return "Geely{" +
                "cost=" + cost +
                "} " + super.toString();
    }
}
