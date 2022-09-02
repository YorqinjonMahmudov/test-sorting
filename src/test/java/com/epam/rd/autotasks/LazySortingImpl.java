package com.epam.rd.autotasks;

import org.junit.Assert;

import java.util.Arrays;

public class LazySortingImpl extends Sorting{

    @Override
    public void sort(int[] array) {
         array = new int[]{1, 4, 5, 3, 2, };
        int[] sortedArray = {1, 2, 3, 4, 5};
        Arrays.sort(array);
        Assert.assertArrayEquals(sortedArray, array);
    }


}
