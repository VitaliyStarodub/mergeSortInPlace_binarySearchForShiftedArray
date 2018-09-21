package com.starodub.mergeSortInPlace;

import java.util.Arrays;

public class MergeSortInPlaceRunner {

    public static void main(String[] args) {
        int[] array = {17, 1, 24, 78, 5, 7, 49, 65};

        MergeSortInPlace sorting = new MergeSortInPlace();
        sorting.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
