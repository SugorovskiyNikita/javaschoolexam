package com.tsystems.javaschool.tasks.subsequence;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {

    /**
     * Checks if it is possible to get a sequence which is equal to the first
     * one by removing some elements from the second one.
     *
     * @param x first sequence
     * @param y second sequence
     * @return <code>true</code> if possible, otherwise <code>false</code>
     */
    @SuppressWarnings("rawtypes")
    public boolean find(List x, List y) {
        List localList = new ArrayList();
        int xElement = 0;
        if (x == null || y == null) {
            throw new IllegalArgumentException();
        } else if (x.isEmpty()) {
            return true;
        } else {
            for (Object o : y) {
                if (o.equals(x.get(xElement))) {
                    localList.add(o);
                    xElement++;
                    if (xElement == x.size()) {
                        break;
                    }
                }
            }
            return localList.equals(x);
        }
    }
}
