package may.ex_04052024;

public class Lab138 {
    public static void main(String[] args) {
        int[] array_1d = {450, 50, 321};

        //2D - arrays
        //Matrix - Row and columns

        //row -> Horizontal
        //column - vertical

        int[][] array_2d = {
                {34, 22, 11},
                {34, 12, 34},
                {11, 23, 98},
        };

        int[][] array_2d_d = new int[3][3];
        //|0,0,0|
        //|0,0,0|
        //|0,0,0|
        array_2d_d[0][0] = 34;
        //|34,0,0|
        //|0,0,0|
        //|0,0,0|
        array_2d_d[0][1] = 12;
        //|34,12,0|
        //|0,0,0|
        //|0,0,0|

        for (int i = 0; i < array_2d_d.length; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.println(array_2d_d[i][j]);
            }
        }

    }
}
