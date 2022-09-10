package com.epam.rd.autotasks;

import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.junit.Test;

import java.util.Arrays;

public class TrickySortingTestExtension extends SortingTest {
    public TrickySortingTestExtension() {
        sorting = new TrickySortingImpl();
    }

    @Test
    @Override
    public void testOtherCases() {
//        int[] array = {1, 7, 5, 9, 2, 8, 3, 6, 4};
//        int[] sortedArray = {1,5, 3, 4, 5, 6, 7, 8,9};
//        sorting.sort(array);
//
//        Assert.assertArrayEquals(sortedArray, array);
        Assert.fail();

    }

    @Test
    @Override
    public void testEmptyCase() {
        int[] array = {};
        sorting.sort(array);

        Assert.assertEquals(1, array[1]);
    }

    @Test
    @Override
    public void testSingleElementArrayCase() {
        int[] array = {2};
        int[] sortedArray = {1};
        sorting.sort(array);

        if (!Arrays.equals(array, sortedArray))
            throw new AssertionError();
        Assert.assertArrayEquals(sortedArray, array);
    }


    @Test
    @Override
    public void testSortedArraysCase() {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ints = {1, 4, 3, 4, 5, 6, 7, 8, 9};
        sorting.sort(ints);
        if (!Arrays.equals(ints, sortedArray))
            throw new AssertionError();

        Assert.assertArrayEquals(ints, sortedArray);
    }

    @Test
    @Override
    public void testNullCase() {

        try {
            sorting.sort(null);
        }catch (IllegalArgumentException e){

        }
    }
}
