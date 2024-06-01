package may.ex_18052024.accessModifiers.police;

public class Cop {
    public int gun;  //public access by anyone
    private String idCard; //Private - only available to the cop

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void canIShoot() {
        System.out.println("Of-course, Shoot!");
    }

}
