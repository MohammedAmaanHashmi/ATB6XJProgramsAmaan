package may.ex_04052024;

public class Lab136 {

    public static void main(String[] args) {
        //Arrays
        //Collection of similar Data Type

        //Find the max in the Arrays
        int[] salaries = {30, 50, 60, 90, 10, 1000, 999};
        //How do we find the Max Sal in the array?
        //Loop -> Logic -> max =0, for i - 0 to length
        //Salaries[i] > max -> max ...0 to 1 - max
        int max_salary = Integer.MIN_VALUE; // -2147483648

        for (int i = 0; i < salaries.length; i++) {

            if (salaries[i] > max_salary) {
                max_salary = salaries[i];
            }

        }
        System.out.println("Max Sal -> " + max_salary);

    }
}
