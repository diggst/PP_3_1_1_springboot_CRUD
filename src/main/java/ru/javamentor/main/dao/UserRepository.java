package ru.javamentor.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javamentor.main.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
