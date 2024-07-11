package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    public List<Car> getCars() {
        Car car1 = new Car(1, "car1", 101);
        Car car2 = new Car(2, "car2", 202);
        Car car3 = new Car(3, "car3", 303);
        Car car4 = new Car(4, "car4", 404);
        Car car5 = new Car(5, "car5", 505);
        return List.of(car1, car2, car3, car4, car5);
    }

    public List<Car> getCarsLimited(List<Car> cars, int limit) {
        return cars.stream().limit(Math.min(limit, 5)).toList();
    }

}
