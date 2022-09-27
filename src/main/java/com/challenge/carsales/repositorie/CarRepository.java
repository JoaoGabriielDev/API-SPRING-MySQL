package com.challenge.carsales.repositorie;

import com.challenge.carsales.entitie.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {

}
