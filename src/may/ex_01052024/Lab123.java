package may.ex_01052024;

public class Lab123 {
    public static void main(String[] args) {
        int a = 10;
        //Arrays
        //Collections of Similar Data Type
        int[] ages = {27, 31, 32, 33, 34};

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[4]);
        System.out.println(ages[5]);  //ArrayIndexOutOfBoundsException
        System.out.println(ages[-1]); //ArrayIndexOutOfBoundsException


        System.out.println(ages.length);

//        int[] ages2 = new int[5];
//
//        ages2[0] = 27;
//        ages2[1] = 31;
//        ages2[2] = 32;
//        ages2[3] = 27;
//        ages2[4] = 33;
//        ages2[5] = 34;

    }
}
