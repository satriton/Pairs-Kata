package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class App {
    public static int solver(List<Integer> numbers) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int count = 0;

        for (int num : numbers) {
            int complement = 10 - num;

            int complementsInMap = countMap.getOrDefault(complement, 0);

            if (complementsInMap > 0) {
                count++;
                countMap.put(complement, complementsInMap - 1);
            } else {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }

        return count;
    }
}
