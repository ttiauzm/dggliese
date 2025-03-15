package PBO;

class akun {
    private double saldo;
    private String pemilik;

    public akun(String pemilik, double saldoAwal) {
        this.pemilik = pemilik;
        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0;
            System.out.println("Saldo awal tidak valid, diatur menjadi 0.");
        }
    }

    public String getPemilik() {
        return pemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldoBaru) {
        if (saldoBaru >= 0) {
            this.saldo = saldoBaru;
        } else {
            System.out.println("Saldo tidak boleh negatif.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            saldo += amount;
            System.out.println("Deposit berhasil: " + amount);
            System.out.println("Saldo setelah deposit: " + saldo);
        } else {
            System.out.println("Jumlah deposit harus lebih dari 0.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Jumlah penarikan harus lebih dari 0");
            return false;
        } else if (amount <= saldo) {
            saldo -= amount;
            System.out.println("Penarikan berhasil: " + amount);
            System.out.println("Saldo setelah withdraw: " + saldo);
            return true;
        } else {
            System.out.println("Penarikan gagal. Saldo tidak mencukupi.");
            return false;
        }
    }
}

public class bank {
    public static void main(String[] args) {
        akun akun1 = new akun("Tia", 700000);
        System.out.println("Nama pemilik: " + akun1.getPemilik());
        System.out.println("Saldo awal: " + akun1.getSaldo());
        akun1.deposit(300000);
        akun1.withdraw(200000);
        akun1.withdraw(2000000);
        akun1.deposit(-1);
        akun1.withdraw(-1);
        akun1.setSaldo(-1);
        System.out.println("Saldo Akhir: " + akun1.getSaldo());
    }
}


