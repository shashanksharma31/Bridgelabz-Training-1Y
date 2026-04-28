package com.gla.String;

public class AllSubstrings {
    public static void main(String[] args) {

        String str = "ABC";   // You can change the string

        int n = str.length();

        System.out.println("All Substrings are:");

        // outer loop → starting index
        for (int i = 0; i < n; i++) {

            // inner loop → ending index
            for (int j = i + 1; j <= n; j++) {

                // substring from i to j-1
                System.out.println(str.substring(i, j));
            }
        }
    }
}
