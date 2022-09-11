package com.epam.rd.autotasks;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class SortingTest {

    Sorting sorting = new Sorting();

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase() {
        sorting.sort(null);
    }

    @Test
    public void testEmptyCase() {
        int[] array = {};
        sorting.sort(array);
        Assert.assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] array = {1};
        sorting.sort(array);
        Assert.assertArrayEquals(new int[]{1}, array);
    }

    @Test
    public void testSortedArraysCase() {
        int[] ints = {1,2,3,4,5,6,7,8,9};
        sorting.sort(ints);

        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9}, ints);
    }

    @Test
    public void testOtherCases() {
        int[] array = {1, 7, 5, 9, 2, 8, 3, 6, 4};
        int[] sortedArray = {1,2, 3, 4, 5, 6, 7, 8,9};
        sorting.sort(array);
        Assert.assertArrayEquals(sortedArray, array);
    }

}