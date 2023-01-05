package ua.edu.ucu.apps.web.appUsers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppUsersRepository extends JpaRepository<AppUser, Integer> {
    Optional<AppUser> findAppUserByEmail(String email);
}
