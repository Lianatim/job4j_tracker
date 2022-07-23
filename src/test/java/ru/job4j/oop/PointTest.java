package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.Point;

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

    @Test
    public void when42to22to66then2() {
        double expected = 2;
        Point firstArg = new Point(4, 2);
        Point secondArg = new Point(2, 2);
        Point thirdArg = new Point(6, 6);
        double out = firstArg.distance(secondArg);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to21to16then1() {
        double expected = 1;
        Point firstArg = new Point(1, 1);
        Point secondArg = new Point(2, 1);
        Point thirdArg = new Point(1, 6);
        double out = firstArg.distance(secondArg);
        Assert.assertEquals(expected, out, 0.01);
    }

}
