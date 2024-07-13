package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public CarServiceImpl() {
        Car car1 = new Car(1, "car1", 101);
        Car car2 = new Car(2, "car2", 202);
        Car car3 = new Car(3, "car3", 303);
        Car car4 = new Car(4, "car4", 404);
        Car car5 = new Car(5, "car5", 505);
        cars = List.of(car1, car2, car3, car4, car5);
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getCarsLimited(List<Car> cars, int limit) {
        return cars.stream().limit(limit).toList();
    }

}
