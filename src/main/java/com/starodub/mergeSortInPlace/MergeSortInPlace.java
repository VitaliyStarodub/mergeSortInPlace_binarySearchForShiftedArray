package com.starodub.mergeSortInPlace;

public class MergeSortInPlace {

    public void sort(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        sortArr(arr, start, end);
    }

    private void sortArr(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            sortArr(arr, start, mid);
            sortArr(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    private void merge(int[] arr, int start, int mid, int end) {
        int left = start;
        int right = mid + 1;

        if (arr[mid] <= arr[right]) {
            return;
        }

        while ((left <= mid) && (right <= end)) {
            if (arr[left] <= arr[right]) {
                left++;
            } else {
                int tmp = arr[right];
                for (int i = (right - left); i > 0; i--) {
                    arr[i + left] = arr[i + left - 1];
                }
                arr[left] = tmp;
                left++;
                mid++;
                right++;
            }
        }
    }
}
