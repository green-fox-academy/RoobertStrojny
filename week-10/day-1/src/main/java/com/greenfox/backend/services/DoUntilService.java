package com.greenfox.backend.services;

import com.greenfox.backend.models.dountil.DoUntil;
import org.springframework.stereotype.Service;

@Service
public interface DoUntilService {
    DoUntil sum(int until);
    DoUntil factorial(int until);
}
