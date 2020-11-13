package com.recipe.recipeapp.repository;

import com.recipe.recipeapp.models.UnitOfMeasurement;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class UnitOfMeasurementRepoIT {

    @Autowired
    UnitOfMeasurementRepo unitOfMeasurementRepo;

    @Test
    void findByDescription() {
        Optional<UnitOfMeasurement> unitOfMeasurement = unitOfMeasurementRepo.findByDescription("Pint");
        assertEquals("Pint",unitOfMeasurement.get().getDescription());
    }
}