package com.marcelocovre.course.repositories;

import com.marcelocovre.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
