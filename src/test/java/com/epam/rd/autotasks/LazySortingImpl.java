package com.epam.rd.autotasks;

import org.junit.Assert;

import java.util.Arrays;
import java.util.Objects;

public class LazySortingImpl extends Sorting{

    @Override
    public void sort(int[] array) {

        Assert.assertNotNull(array);

            Arrays.sort(array);
    }


}
