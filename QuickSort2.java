/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksort2;

import java.util.Arrays;

/**
 *
 * @author HLUMELO
 */
import java.util.Arrays;

import java.util.Arrays;

import java.util.Arrays;

import java.util.Arrays;

public class QuickSort2 {
    public static void main(String[] args) {
        int[] arr = {42, 17, 91, 23, 5, 71, 34, 19, 8, 57};
        System.out.println("Original array: " + Arrays.toString(arr));
        int pivotIndex = 0; // Hardcode your desired pivot index here

        quickSort(arr, 0, arr.length - 1, pivotIndex);

        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Pivot index: " + pivotIndex);
    }

    public static void quickSort(int[] arr, int low, int high, int pivotIndex) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high, pivotIndex);
            quickSort(arr, low, partitionIndex - 1, pivotIndex);
            quickSort(arr, partitionIndex + 1, high, pivotIndex);
        }
    }

    public static int partition(int[] arr, int low, int high, int pivotIndex) {
        int pivot = arr[pivotIndex];

        // Move the pivot element to the end temporarily
        swap(arr, pivotIndex, high);

        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }

        // Move the pivot element back to its correct position
        swap(arr, i, high);

        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}





