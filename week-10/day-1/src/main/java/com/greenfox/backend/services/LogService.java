package com.greenfox.backend.services;

import com.greenfox.backend.models.logs.Log;
import com.greenfox.backend.models.logs.Logs;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LogService {
    List<Log> findAllLogs();
    Log saveLog(String endpoint, String data);
    Logs getAllLogs();
}
