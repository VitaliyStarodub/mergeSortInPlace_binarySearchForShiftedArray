package com.starodub.binarySearchForShiftedArray;

public class BinarySearchForShiftedArrayRunner {

    public static void main(String[] args) {

        BinarySearchForShiftedArray bs = new BinarySearchForShiftedArray();
        int arr[] = {5, 6, 9, 10, 15, 1, 3, 4};
        //int arr[] = {5, 5, 1, 3, 4, 5, 5, 5, 5};
        //int arr[] = {1, 2, 3, 4, 5, 6, 7 ,8, 9};
        int result = bs.binarySearchForShiftedArrayWithRecursion(arr, 15);

        System.out.println("Index of number is " + result + ", number " + arr[result]);
    }
}
