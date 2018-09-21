package com.starodub.binarySearchForShiftedArray;

public class BinarySearchForShiftedArrayRunner {

    public static void main(String[] args) {

        BinarySearchForShiftedArray bs = new BinarySearchForShiftedArray();
        //int arr[] = {5, 6, 9, 10, 15, 1, 3, 4};
        int arr[] = {5, 5, 1, 3, 4, 5, 5, 5, 5};
        int result = bs.binarySearchForShiftedArray(arr, 3);

        System.out.println("Index of number is " + result + ", number " + arr[result]);
    }
}
