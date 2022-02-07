package com.greenfox.backend.models;

import com.greenfox.backend.services.LogServiceImpl;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Logs {

    private List<Log> entries;
    private int entry_count;

    public Logs(List<Log> entries, int entry_count) {
        this.entries = entries;
        this.entry_count = entry_count;
    }
}
