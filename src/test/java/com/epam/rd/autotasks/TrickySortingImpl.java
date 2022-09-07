package com.epam.rd.autotasks;

import org.junit.Assert;

import java.util.Arrays;

public class TrickySortingImpl extends Sorting{
    @Override
    public void sort( int[] array) {
        Assert.assertNotNull(array);

        Arrays.sort(array);
    }
}
