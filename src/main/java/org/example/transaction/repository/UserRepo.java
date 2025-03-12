package org.example.transaction.repository;

import org.example.transaction.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User  ,Integer> {
}
