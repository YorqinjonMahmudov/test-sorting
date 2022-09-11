package com.epam.rd.autotasks;

import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.junit.Test;

import static org.junit.Assert.fail;

public class LazySortingTestExtension extends SortingTest{

    public LazySortingTestExtension() {
        sorting = new LazySortingImpl();
    }

}
