package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> listOfCars;

    public CarServiceImpl() {
        listOfCars = new ArrayList<>();
        listOfCars.add(new Car(1, "Kia Rio", "black"));
        listOfCars.add(new Car(2, "Lada Kalina", "blue"));
        listOfCars.add(new Car(3, "Vaz2106", "red"));
        listOfCars.add(new Car(4, "Geely AtlasPro", "black"));
        listOfCars.add(new Car(5, "Kia Sorento", "greenSpruce"));
    }

    @Override
    public List<Car> returningTheListOfCars(int count) {
        return listOfCars.stream().limit(count).collect(Collectors.toList());
    }
}
