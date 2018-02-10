package task2;

public abstract class Car {

    private String marks;
    private String model;
    private int year;
    private double capacity;
    private boolean automaticTransmission;

    public Car(String marks, String model, int year, double capacity, boolean automaticTransmission) {
        this.marks = marks;
        this.model = model;
        this.year = year;
        this.capacity = capacity;
        this.automaticTransmission = automaticTransmission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (Double.compare(car.capacity, capacity) != 0) return false;
        if (automaticTransmission != car.automaticTransmission) return false;
        if (marks != null ? !marks.equals(car.marks) : car.marks != null) return false;
        return model != null ? model.equals(car.model) : car.model == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = marks != null ? marks.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + year;
        temp = Double.doubleToLongBits(capacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (automaticTransmission ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marks='" + marks + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", capacity=" + capacity +
                ", automaticTransmission=" + automaticTransmission +
                '}';
    }
}
