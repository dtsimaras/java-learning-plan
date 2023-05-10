package com.booleanuk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LearningPlanTest {

    private LearningPlan plan;
    @BeforeEach
    public void setup() {
        plan = new LearningPlan();
    }

    @Test
    public void testLearningPlanInitialState() {
        Assertions.assertEquals(0, plan.capacity);
        Assertions.assertTrue(plan.planCosts.isEmpty());
        Assertions.assertTrue(plan.planItems.isEmpty());
    }

    @Test
    public void testAddPlanItemAndCost() {
        plan.add("Java Course", 500);

        Assertions.assertEquals("Java Course", plan.planItems.get(0));
        Assertions.assertEquals(500, plan.planCosts.get(0));
    }

    @Test
    public void testShouldNotExceedCapacity() {
        plan.capacity = 2;
        plan.add("Java Course", 500);
        plan.add("C++ Course", 550);
        plan.add("React Course", 5);

        Assertions.assertEquals(2, plan.planItems.size());
        Assertions.assertEquals(2, plan.planCosts.size());
    }
}
