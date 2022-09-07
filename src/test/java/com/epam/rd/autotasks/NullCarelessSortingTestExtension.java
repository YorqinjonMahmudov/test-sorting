package com.epam.rd.autotasks;

import org.junit.Test;

import java.rmi.UnexpectedException;

public class NullCarelessSortingTestExtension extends SortingTest{

    public NullCarelessSortingTestExtension() {
        sorting = new NullCarelessSortingImpl();
    }

    @Test(expected = AssertionError.class)
    @Override
    public void testNullCase() {
        sorting.sort(null);

    }
}
