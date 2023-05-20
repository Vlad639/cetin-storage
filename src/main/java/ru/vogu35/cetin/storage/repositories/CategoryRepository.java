package ru.vogu35.cetin.storage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vogu35.cetin.storage.models.Category;
import ru.vogu35.cetin.storage.models.History;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
