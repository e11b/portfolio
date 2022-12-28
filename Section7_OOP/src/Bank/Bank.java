package Bank;

public class Bank {

    private String accountNo;
    private double balance;
    private String customer_name;
    private String email;
    private String phone_number;

    //new constructor

    public Bank() {
        this("1002", 200_000, "Default Name",
                "Default Address", "Default phone");

        System.out.println("Empty constructor called");
    }

    public Bank(String accountNo, double balance, String customer_name, String email, String phone_number) {
        System.out.println("Account constructor with parameters called");
        this.accountNo = accountNo;
        this.customer_name = customer_name;
        this.email = email;
        this.phone_number = phone_number;

    }

    public Bank(String customer_name, String email, String phone_number) {
        this("99999", 100.55, customer_name, email, phone_number);
//        this.customer_name = customer_name;
//        this.email = email;
//        this.phone_number = phone_number;
    }

    //methods for deposit and withdrawals

    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is S" + balance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (balance - withdrawalAmount <0 ) {
            System.out.println("Insufficient Funds! You only have $" + balance + " in your account.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " made. New balance is S" + balance);
        }
    }

// get //

    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }

//set

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance) {
        if (balance  < 0) {
            this.balance = -1;
        } else
            this.balance -= balance;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
