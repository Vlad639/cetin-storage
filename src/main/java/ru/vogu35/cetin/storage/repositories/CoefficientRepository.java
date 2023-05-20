package ru.vogu35.cetin.storage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vogu35.cetin.storage.models.Category;
import ru.vogu35.cetin.storage.models.Coefficient;

public interface CoefficientRepository extends JpaRepository<Coefficient, Long> {
}
