package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void test_empty_list() {
        List<Integer> numbers = Collections.emptyList();
        assertEquals(0, App.solver(numbers));
    }

    @Test
    public void test_no_pairs_in_list() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(0, App.solver(numbers));
    }

    @Test
    public void test_with_one_pair() {
        List<Integer> numbers = Arrays.asList(1, 9, 8, 3);
        assertEquals(1, App.solver(numbers));
    }

    @Test
    public void test_with_multiple_pairs() {
        List<Integer> numbers = Arrays.asList(2, 8, 3, 1, 7, 6, 5, 4, 9, 1, 6, 4, 3, 2, 5, 7, 8, 9);
        assertEquals(9, App.solver(numbers));
    }

    @Test
    public void test_with_same_pairs() {
        List<Integer> numbers = Arrays.asList(1, 9, 9, 9, 1, 1, 3);
        assertEquals(3, App.solver(numbers));
    }
}
