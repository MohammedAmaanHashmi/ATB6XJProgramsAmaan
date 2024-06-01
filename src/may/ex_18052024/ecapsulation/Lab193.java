package may.ex_18052024.ecapsulation;

public class Lab193 {
    public static void main(String[] args) {
        ICICIBank i = new ICICIBank("Pramod", 100);
        System.out.println(i.getBal());
        i.setBal(-100);
        System.out.println(i.getBal());
    }
}
