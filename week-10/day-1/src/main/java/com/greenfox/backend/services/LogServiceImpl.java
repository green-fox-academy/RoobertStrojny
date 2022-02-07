package com.greenfox.backend.services;

import com.greenfox.backend.models.Log;
import com.greenfox.backend.models.Logs;
import com.greenfox.backend.repositories.LogRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Service
public class LogServiceImpl implements LogService {

    LogRepository logRepository;

    @Autowired
    public LogServiceImpl(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Override
    public List<Log> findAllLogs() {
        return logRepository.findAll();
    }

    @Override
    public Log saveLog(String endpoint, String data) {
        return logRepository.save(new Log(endpoint, data));
    }

    @Override
    public Logs getAllLogs() {
        return new Logs(findAllLogs(), findAllLogs().size());
    }
}
