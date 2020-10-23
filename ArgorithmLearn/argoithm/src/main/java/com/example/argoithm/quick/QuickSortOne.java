package com.example.argoithm.quick;

import java.util.Arrays;
import java.util.Collections;

import sun.rmi.runtime.Log;

/**
 * Created by yajie.wang on 2020/10/23
 */
public class QuickSortOne {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 8, 5, 7, 4, 3};
        System.out.println("start: "+System.currentTimeMillis());
       quickSort(arr);
        //Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("end: "+System.currentTimeMillis());
    }

    private static void quickSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (arr == null || arr.length <= 1) return;
        if (start >=end) return;
        int i = start;
        int j = end;
        int key = arr[start];
        while (j > i) {
            while (j > i && arr[j] >= key) {
                j--;
            }
            while (j > i && arr[i] <= key) {
                i++;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        arr[start] = arr[i];
        arr[i] = key;
        quickSort(arr, start, i - 1);
        quickSort(arr, i + 1, end);
    }

}
