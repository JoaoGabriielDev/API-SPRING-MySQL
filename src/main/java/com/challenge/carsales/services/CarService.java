package com.challenge.carsales.services;

import com.challenge.carsales.entities.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {

 Optional<Car> findById(Long id);

 Optional<Car> deleteCar(Car car, Long id);

 Car createCar(Car car);

 Car updateCar (Car car, Long id);

 List<Car> listCar();

}
