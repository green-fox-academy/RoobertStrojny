package com.greenfox.backend.repositories;

import com.greenfox.backend.models.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface LogRepository extends JpaRepository<Log, Long> {
}
