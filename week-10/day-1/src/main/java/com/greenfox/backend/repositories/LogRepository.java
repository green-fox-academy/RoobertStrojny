package com.greenfox.backend.repositories;

import com.greenfox.backend.models.logs.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, Long> {
}
