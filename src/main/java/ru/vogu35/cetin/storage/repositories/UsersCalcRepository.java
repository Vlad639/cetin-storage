package ru.vogu35.cetin.storage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vogu35.cetin.storage.models.UsersCalc;

public interface UsersCalcRepository extends JpaRepository<UsersCalc, Long> {
}
