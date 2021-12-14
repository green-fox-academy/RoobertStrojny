package com.greenfox.sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void sum_of_multiple_int() {
        List<Integer> list = new ArrayList<>();
        Sum sum = new Sum(list);
        sum.add(5);
        sum.add(3);
        sum.add(7);
        assertEquals(15, sum.getSum());
    }

    @Test
    void sum_of_empty_list() {
        List<Integer> list = new ArrayList<>();
        Sum sum = new Sum(list);
        assertEquals(0 , sum.getSum());
    }

    @Test
    void sum_of_one_int() {
        List<Integer> list = new ArrayList<>();
        Sum sum = new Sum(list);
        sum.add(5);
        assertEquals(5, sum.getSum());
    }

    @Test
    void sum_of_null_list() {
        Sum sum = new Sum(null);
        assertNull(sum.getSum());
    }


}