package ru.vsu.cs.course1;


public class Task {
    public static void RotationMatrix(int[][] arr2) {
        int n = arr2.length;
        for (int i = 0; i < n / 2; i++) {
            int last = n - 1 - i;
            for (int j = i; j < last; j++) {
                int top = arr2[i][j];
                arr2[i][j] = arr2[last - j][i];
                arr2[last - j][i] = arr2[last][last - j];
                arr2[last][last - j] = arr2[j][last];
                arr2[j][last] = top;
            }
        }
    }
}
