package com.greenfox.backend.services;

import com.greenfox.backend.models.Append;
import org.springframework.stereotype.Service;

@Service
public interface AppendService {
    Append appendLetterA(String append);
}
