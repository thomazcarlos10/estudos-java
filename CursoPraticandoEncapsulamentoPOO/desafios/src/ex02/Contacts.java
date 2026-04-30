package ex02;

public class Contacts {
    private String name;
    private String telephoneNumber;

    public Contacts(String name, String telephoneNumber) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }
}