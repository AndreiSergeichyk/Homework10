package task2;

public enum CarType {

    BMW("bmw"),
    TOYOTA("toyota"),
    GEELY("geely"),
    VOLKSWAGEN("volkswagen");

    CarType(String type) {
        this.type = type;
    }

    private String type;

    public String getType() {
        return type;
    }
}
