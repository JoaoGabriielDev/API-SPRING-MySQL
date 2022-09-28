package com.challenge.carsales.service;

import com.challenge.carsales.entitie.Car;
import com.challenge.carsales.repositorie.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public Optional<Car> findById(Long id){
        return carRepository.findById(id);
    }

    @Override
    public void deleteCar(Car car, Long id){
        Optional<Car> carDelete = findById(id);
        carRepository.delete(carDelete.get());
    }

    @Override
    public Car createCar(Car car){
        return carRepository.save(car);
    }

    @Override
    public Car updateCar (Car car, Long id){
            Optional<Car> carUpdate = findById(id);

            carUpdate.get().setNome(car.getNome());
            carUpdate.get().setMarca(car.getMarca());

            Car carSaved = carRepository.save(carUpdate.get());

            return carSaved;
    }

    @Override
    public List<Car> listCar(){
        return carRepository.findAll();
    }
}
