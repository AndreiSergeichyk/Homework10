package task2;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    private Map<Car, Integer> garageMap = new HashMap<>();

    public void parking(Car car) {
        if (garageMap.containsKey(car)) {
            garageMap.put(car, garageMap.get(car) + 1);
        } else {
            garageMap.put(car, 1);
        }
    }

    public void cheekOutCar(Car car) {
        if (garageMap.get(car) > 1) {
            garageMap.put(car, garageMap.get(car) - 1);
        } else {
            garageMap.remove(car);
        }
    }

    public int countCarInGarage(Car car) {
        int count = 0;
        if (garageMap.containsKey(car)) {
            count = garageMap.get(car);
        }

        return count;
    }
}
