package Bank;

public class Main2 {

    public static void main(String[] args) {

//        Bank ericAccount = new Bank("9710", 100000,
//                "Eric Jung", "e.jung7589@gmail.com",
//                "512-650-0126"  );

        Bank ericAccount = new Bank();

        System.out.println(ericAccount.getAccountNo());
        System.out.println(ericAccount.getBalance());


        ericAccount.depositFunds(10_000);
        ericAccount.withdrawFunds(1_000);
        ericAccount.withdrawFunds(9_000);

        ericAccount.depositFunds(0.10);
        ericAccount.withdrawFunds(0.5);

        Bank ableAccount = new Bank("Tim", "tim@email.com", "12345");
        System.out.println("AccountNo: " + ableAccount.getAccountNo() + "; name " + ableAccount.getCustomer_name());
    }
}
