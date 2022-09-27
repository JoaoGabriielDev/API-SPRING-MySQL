package com.challenge.carsales.repositories;

import com.challenge.carsales.entities.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
