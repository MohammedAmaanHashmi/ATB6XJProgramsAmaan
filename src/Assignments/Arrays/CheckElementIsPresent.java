package Assignments.Arrays;

public class CheckElementIsPresent {
    public static void main(String[] args) {

        int[][] arr = {
                {34, 56, 35},
                {32, 8, 25},
                {98, 345, 5},
        };

        boolean elementIsPresent = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == 8) {
                    elementIsPresent = true;
                }
            }
        }

        if (elementIsPresent == true) {
            System.out.println("element is present");
        } else {
            System.out.println("element is not present");
        }
    }


}
