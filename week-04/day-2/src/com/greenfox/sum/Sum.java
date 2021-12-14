package com.greenfox.sum;

import java.util.List;

public class Sum {
    private final List<Integer> list;

    public Sum(List<Integer> list) {
        this.list = list;
    }

    public void add(int number) {
        list.add(number);
    }

    public Integer getSum() {
        if (list == null) {
            return null;
        }

        if (list.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return sum;
    }
}
