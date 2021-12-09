package com.car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.List;

@RepositoryRestResource(collectionResourceRel = "cars",path = "cars")
public interface CarRepository extends JpaRepository<Car,Integer> {
    Car findByNameEqualsIgnoreCase(String name);
    Car findByOwnerEqualsIgnoreCase(String owner);

    List<Car> findByOrderByNameAsc();
    List<Car> findByOrderByModelAsc();


}
