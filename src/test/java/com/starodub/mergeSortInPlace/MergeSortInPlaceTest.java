package com.starodub.mergeSortInPlace;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class MergeSortInPlaceTest {

    private int[] array;
    private int[] arraySorted;
    private MergeSortInPlace mergeSortInPlace;

    @Before
    public void setUp() throws Exception {
        array = new int[]{17, 1, 24, 78, 5, 7, 49, 65};
        arraySorted = new int[]{1, 5, 7, 17, 24, 49, 65, 78};
        mergeSortInPlace = new MergeSortInPlace();
    }

    @Test
    public void testArrSortComparingWithSortedArray() {
        mergeSortInPlace.sort(array);
        Assert.assertArrayEquals(arraySorted, array);
    }
}