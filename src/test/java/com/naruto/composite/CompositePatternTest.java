package com.naruto.composite;

import org.junit.jupiter.api.Test;

public class CompositePatternTest {
    @Test
    public void testShapeAndGroupHierarchy() {
        Group subGroup1 = new Group();
        subGroup1.add(new Shape("Square"));
        subGroup1.add(new Shape("Square"));

        Group subGroup2 = new Group();
        subGroup2.add(new Shape("Circle"));
        subGroup2.add(new Shape("Circle"));

        Group group = new Group();
        group.add(subGroup1);
        group.add(subGroup2);

        group.render();
    }
}
