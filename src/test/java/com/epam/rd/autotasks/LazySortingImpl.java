package com.epam.rd.autotasks;

import org.junit.Assert;

import java.util.Arrays;

public class LazySortingImpl extends Sorting{

    @Override
    public void sort(int[] array) {
        try {
            Arrays.sort(array);
        }catch (NullPointerException e){
            throw new AssertionError();
        }
    }


}
