package Bank;

public class Main2 {

    public static void main(String[] args) {

        Bank ericAccount = new Bank();
        ericAccount.setAccountNo("9710");
        ericAccount.setCustomer_name("Eric Jung");
        ericAccount.setEmail("e.jung7589@gmail.com");
        ericAccount.setBalance(-100000);
        ericAccount.setPhone_number("512-650-0126");



        ericAccount.depositFunds(10_000);
        ericAccount.withdrawFunds(1_000);
        ericAccount.withdrawFunds(9_000);

        ericAccount.depositFunds(0.10);
        ericAccount.withdrawFunds(0.5);



    }
}
