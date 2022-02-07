package com.greenfox.backend.services;

import com.greenfox.backend.models.Append;
import org.springframework.stereotype.Service;

@Service
public class AppendServiceImpl implements AppendService {

    @Override
    public Append appendLetterA(String append) {
        return new Append(append.concat("a"));
    }
}
