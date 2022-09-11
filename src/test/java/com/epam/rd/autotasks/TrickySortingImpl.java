package com.epam.rd.autotasks;

import org.junit.Assert;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class TrickySortingImpl extends Sorting {
    @Override
    public void sort(int[] array) {
            super.sort(array);
            array[0] = new Random().nextInt();
    }
}
