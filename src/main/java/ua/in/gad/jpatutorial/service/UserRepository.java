package ua.in.gad.jpatutorial.service;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.in.gad.jpatutorial.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
