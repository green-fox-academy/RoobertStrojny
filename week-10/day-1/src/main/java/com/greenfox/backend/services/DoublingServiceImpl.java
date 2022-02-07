package com.greenfox.backend.services;

import com.greenfox.backend.models.Doubling;
import org.springframework.stereotype.Service;

@Service
public class DoublingServiceImpl implements DoublingService{

    @Override
    public Doubling doubling(int input) {
        return new Doubling(input);
    }
}
