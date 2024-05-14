package Assignments.Arrays;

public class MaximumValueIn2DArray {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {525, 10, 6},
                {7, 8, 9},

        };

        int max_value = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > max_value) {
                    max_value=arr[i][j];
                }

            }
        }
        System.out.println(max_value);
    }
}
