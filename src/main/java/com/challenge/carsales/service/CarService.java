package com.challenge.carsales.service;

import com.challenge.carsales.entitie.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {

 Optional<Car> findById(Long id);

 void deleteCar(Car car, Long id);

 Car createCar(Car car);

 public Car updateCar (Car car, Long id);

 public List<Car> listCar();

}
