package com.recipe.recipeapp.repository;

import com.recipe.recipeapp.models.UnitOfMeasurement;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasurementRepo extends CrudRepository<UnitOfMeasurement,Long> {
    Optional<UnitOfMeasurement> findByDescription(String description);
}
