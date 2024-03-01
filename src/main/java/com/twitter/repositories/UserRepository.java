package com.twitter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.twitter.models.ApplicationUser;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<ApplicationUser, Integer> {
    Optional<ApplicationUser> findByUsername(String username);
}
