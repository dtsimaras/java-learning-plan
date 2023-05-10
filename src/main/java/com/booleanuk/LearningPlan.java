package com.booleanuk;

import java.util.ArrayList;
import java.util.List;

public class LearningPlan {

    List<String> planItems;
    List<Integer> planCosts;
    int capacity;

    public LearningPlan() {
        planItems = new ArrayList<>();
        planCosts = new ArrayList<>();
    }

    public void add(String item, int cost) {
        if (planItems.size() < capacity) {
            planItems.add(item);
            planCosts.add(cost);
        } else {
            System.out.println("Max capacity");
        }
    }
}
