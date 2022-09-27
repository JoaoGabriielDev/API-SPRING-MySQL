package com.challenge.carsales.repositories;

import com.challenge.carsales.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {

}
