public class main {

    public static void main (String[] args) {

        BankAccount akun1 = new BankAccount("123456", "Budiono Siregar", 100000);
        BankAccount akun2 = new BankAccount("7891011", "Ani Ani");

        akun1.displayInfo();
        System.out.println();
        akun2.displayInfo();

        akun1.deposit(200000);
        akun1.withdraw(100000);
        akun2.deposit(150000);
        akun2.withdraw(50000);

        System.out.println();
        akun1.displayInfo();
        System.out.println();
        akun2.displayInfo();
    }
}
