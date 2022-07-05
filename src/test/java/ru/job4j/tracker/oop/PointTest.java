package ru.job4j.tracker.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point firstArg = new Point(0, 0);
        Point secondArg = new Point(2, 0);
        double out = firstArg.distance(secondArg);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to22then2() {
        double expected = 2;
        Point firstArg = new Point(4, 2);
        Point secondArg = new Point(2, 2);
        double out = firstArg.distance(secondArg);
        Assert.assertEquals(expected, out, 0.01);
    }

}
