package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private long greetCount;
    private String content;
    private final AtomicLong atomicLong;

    public Greeting(String content) {
        this.greetCount = 0;
        this.content = content;
        atomicLong = new AtomicLong(0);
    }

    public long count() {
        greetCount = atomicLong.get();
        return atomicLong.incrementAndGet();
    }

    public void setContent(String content) {
        this.content = content;
    }


}
