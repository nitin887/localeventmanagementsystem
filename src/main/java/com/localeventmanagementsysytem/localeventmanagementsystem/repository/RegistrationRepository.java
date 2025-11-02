package com.localeventmanagementsysytem.localeventmanagementsystem.repository;

import com.localeventmanagementsysytem.localeventmanagementsystem.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    Optional<Registration> findByUserIdAndEventId(Long userId, Long eventId);
    Optional<Registration> findByUserId(Long userId);
    Optional<Registration> findByEventId(Long eventId);
    Optional<Registration> findById(Long id);
}
