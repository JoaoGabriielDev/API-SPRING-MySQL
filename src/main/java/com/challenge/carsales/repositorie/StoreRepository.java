package com.challenge.carsales.repositorie;

import com.challenge.carsales.entitie.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
