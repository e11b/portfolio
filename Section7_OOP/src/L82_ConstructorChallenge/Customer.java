package L82_ConstructorChallenge;

public class Customer {

    // main fields

    private String name;
    private int creditLimit;
    private String email;

    //constructor

    public Customer() {
        this("Alpha", "abcdef");
        System.out.println("Empty constructor called");
    }

    public Customer(String name, String email) {
        this(name, 800, email);
    }

    public Customer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Constructor with variables called.");
    }


    // getter

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
