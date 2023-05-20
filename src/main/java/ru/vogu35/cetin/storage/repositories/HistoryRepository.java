package ru.vogu35.cetin.storage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vogu35.cetin.storage.models.History;

public interface HistoryRepository extends JpaRepository<History, Long> {
}
