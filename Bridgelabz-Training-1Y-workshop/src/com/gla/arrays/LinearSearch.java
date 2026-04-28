package com.gla.arrays;

public class LinearSearch {
    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8, 10};
        int key = 6;

        int position = -1;

        // Linear Search
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                position = i;
                break;
            }
        }

        if(position != -1)
            System.out.println("Element found at index: " + position);
        else
            System.out.println("Element not found");
    }
}

