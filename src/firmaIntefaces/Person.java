package firmaIntefaces;

/**
 * Created by arabk on 30.07.2017.
 */
public abstract class Person {

    // encja to klasa odzwierciedlajaca obiekt z rzeczywistosci
    // klasa math to nie encja, osoba tak
    // z reguły ma id
    protected Long id;
    protected String name, surname;

    public Person(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
