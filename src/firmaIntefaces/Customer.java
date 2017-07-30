package firmaIntefaces;

/**
 * Created by arabk on 30.07.2017.
 */
public class Customer extends Person {
    protected String address;

    public Customer(Long id, String name, String surname, String address) {
        super(id, name, surname);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
