package com.starodub.binarySearchForShiftedArray;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchForShiftedArrayTest {

    private BinarySearchForShiftedArray bis;
    private int[] arrRightShift;
    private int[] arrLeftShift;

    @Before
    public void setUp() throws Exception {
        bis = new BinarySearchForShiftedArray();
        arrRightShift = new int[]{5, 6, 9, 10, 15, 1, 3, 4};
        arrLeftShift = new int[]{5, 5, 1, 3, 4, 5, 5, 5, 5};
    }

    @Test
    public void testSearchingFirstElemIndexInRightShiftedArray() {
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, bis.binarySearchForShiftedArray(arrRightShift, 5));
    }

    @Test
    public void testSearchingLastElemIndexInRightShiftedArray() {
        int expectedResult = 7;
        Assert.assertEquals(expectedResult, bis.binarySearchForShiftedArray(arrRightShift, 4));
    }

    @Test
    public void testSearchingRandomElemIndexInRightShiftedArray() {
        int expectedResult = 4;
        Assert.assertEquals(expectedResult, bis.binarySearchForShiftedArray(arrRightShift, 15));
    }

    @Test
    public void testSearchingFirstElemIndexInLeftShiftedArray() {
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, bis.binarySearchForShiftedArray(arrLeftShift, 5));
    }

    @Test
    public void testSearchingRandElemIndexInLeftShiftedArray() {
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, bis.binarySearchForShiftedArray(arrLeftShift, 1));
    }
}