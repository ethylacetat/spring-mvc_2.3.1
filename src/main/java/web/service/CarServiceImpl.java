package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.*;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>(5);

    public CarServiceImpl() {
        Random random = new Random(System.currentTimeMillis());

        Car car;
        car = new Car("Mini", random.nextInt(Integer.MAX_VALUE), random.nextInt(Integer.MAX_VALUE));
        cars.add(car);

        car = new Car("Belaz", random.nextInt(Integer.MAX_VALUE), random.nextInt(Integer.MAX_VALUE));
        cars.add(car);

        car = new Car("BMW", random.nextInt(Integer.MAX_VALUE), random.nextInt(Integer.MAX_VALUE));
        cars.add(car);

        car = new Car("Lada", random.nextInt(Integer.MAX_VALUE), random.nextInt(Integer.MAX_VALUE));
        cars.add(car);

        car = new Car("qwerty", random.nextInt(Integer.MAX_VALUE), random.nextInt(Integer.MAX_VALUE));
        cars.add(car);
    }

    @Override
    public List<Car> getCars(int carsCount) {

        if (carsCount < 0) {
            return Collections.emptyList();
        }

        if (carsCount >= 5) {
            return new ArrayList<>(cars);
        }

        return cars.subList(0, carsCount);
    }
}
