public class BankAccount {
    private String noRek;
    private String namaPemilik;
    private double saldo;

    public BankAccount(String noRek, String namaPemilik, double saldo) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public BankAccount(String noRek, String namaPemilik) {
        this(noRek, namaPemilik, 0.0);
    }

    public void displayInfo() {
        System.out.println("Nomor Rekening: " + noRek);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo);
    }

    public void deposit(double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal deposit harus lebih dari 0!");
        } else {
            saldo += nominal;
            System.out.println("Berhasil deposit sebesar: " + nominal);
        }
    }

    public void withdraw(double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal penarikan harus lebih dari 0!");
        } else if (nominal > saldo) {
            System.out.println("Saldo tidak mencukupi!");
        } else {
            saldo -= nominal;
            System.out.println("Berhasil menarik sebesar: " + nominal);
        }
    }
}

