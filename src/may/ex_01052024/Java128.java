package may.ex_01052024;

public class Java128 {
    public static void main(String[] args) {
        // == Ref
        // .equals() -> Values/Content

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 3, 4, 5};

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1 == arr2); //Objects.java - ref.

        int[] arr3 = arr1;
        System.out.println(arr1 == arr3);

        System.out.println(arr1.equals(arr2)); //Content - Strings.java



    }
}
