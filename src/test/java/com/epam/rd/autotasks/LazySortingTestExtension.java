package com.epam.rd.autotasks;

import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.junit.Test;

import static org.junit.Assert.fail;

public class LazySortingTestExtension extends SortingTest{

    public LazySortingTestExtension() {
        sorting = new LazySortingImpl();
    }

    @Test
    @Override
    public void testOtherCases() {
//        int[] array = {1, 7, 5, 9, 2, 8, 3, 6, 4};
//        int[] sortedArray = {1,5, 3, 4, 5, 6, 7, 8,9};
//        sorting.sort(array);
//        Assert.assertArrayEquals(sortedArray, array);
        fail();
    }

    @Test
    @Override
    public void testNullCase() {
           try {

               sorting.sort(null);
           }catch (IllegalArgumentException e){
               fail();
           }

    }
}
