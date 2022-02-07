package com.greenfox.backend.services;

import com.greenfox.backend.models.Log;
import com.greenfox.backend.models.Logs;

import java.util.List;

public interface LogService {
    List<Log> findAllLogs();
    Log saveLog(String endpoint, String data);
    Logs getAllLogs();
}
