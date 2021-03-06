package com.starodub.binarySearchForShiftedArray;

public class BinarySearchForShiftedArray {

    public int binarySearchForShiftedArrayWithRecursion(int[] arr, int number) {
        return search(arr, 0, arr.length - 1, number);
    }

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

    private int search(int arr[], int start, int end, int number) {

        int mid = (start + end) / 2;
        if (arr[mid] == number) {
            return mid;
        }
        if(arr[start] < arr[mid]) {
            if(number >= arr[start] && number < arr[mid]) {
                return search(arr, start, mid - 1, number);
            } else {
                return search(arr, mid + 1, end, number);
            }
        }else if(arr[mid] < arr[start]) {
            if(number > arr[mid] && number <= arr[end]) {
                return search(arr, mid + 1, end, number);
            } else {
                return search(arr, start, mid -1, number);
            }
        }

        return -1;
    }
}
