package may.ex_18052024.ecapsulation;

public class ICICIBank {

    //Private
    //Use setter and getter with condition to secure your  data members by methods
    //hide the data members - ecap

    String name;
    long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        if (bal > 0) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed");
        }
    }
}
