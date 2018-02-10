package task2;

public class Toyota extends Car {

    private boolean sportCar;

    public Toyota(String model, int year, double capacity, boolean automaticTransmission, boolean sportCar) {
        super(CarType.TOYOTA.getType(), model, year, capacity, automaticTransmission);
        this.sportCar = sportCar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Toyota toyota = (Toyota) o;

        return sportCar == toyota.sportCar;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (sportCar ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "sportCar=" + sportCar +
                "} " + super.toString();
    }
}
