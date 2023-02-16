package inherance;

import java.util.Date;

@SuppressWarnings("unused")
public class Customer extends Person {
    private static int customerCounter;

    private int idCustomer;
    private Date registerDate;
    private boolean isVip;

    public Customer(String name, char genre, int age, String address, boolean isVip) {
        super(name, genre, age, address);
        this.isVip = isVip;
        this.idCustomer = ++Customer.customerCounter;
        this.registerDate = new Date();
    }

    public int getIdCustomer() {
        return this.idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Date getRegisterDate() {
        return this.registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public boolean isVip() {
        return this.isVip;
    }

    public void setVip(boolean vip) {
        this.isVip = vip;
    }

    @Override
    public String toString() {
        return "Customer{" + "idCustomer=" + idCustomer +
                ", registerDate=" + registerDate +
                ", isVip=" + isVip +
                ", " + super.toString() +
                '}';
    }
}
