package ru.vogu35.cetin.storage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vogu35.cetin.storage.models.MethodicRedaction;

public interface MethodicRepository extends JpaRepository<MethodicRedaction, Long> {
}
