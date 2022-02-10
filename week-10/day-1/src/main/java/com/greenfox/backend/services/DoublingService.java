package com.greenfox.backend.services;

import com.greenfox.backend.models.Doubling;
import org.springframework.stereotype.Service;

@Service
public interface DoublingService {
    Doubling doubling(int input);
}
