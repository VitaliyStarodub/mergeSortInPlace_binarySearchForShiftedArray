package com.starodub.binarySearchForShiftedArray;

public class BinarySearchForShiftedArray {

    public int binarySearchForShiftedArray(int arr[], int number) {
        int start = -1;
        int end = arr.length;
        int n = arr.length - 1;

        while (start < end - 1) {
            int mid = (start + end) / 2;

            if (arr[mid] >= arr[n]) {
                start = mid;
            } else {
                end = mid;
            }
        }
        int index = start;

        if (number >= arr[0]) {
            start = -1;
            end = index + 1;
        } else if (number <= arr[n]) {
            start = index;
            end = n;
        }

        while (start < end - 1) {
            int mid = (start + end) / 2;
            if (arr[mid] < number) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return arr[end] == number ? end : -1;
    }
}
