import java.util.Scanner;

public class tugas2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Masukkan nama anda: ");
        String nama = scanner.nextLine();
        System.out.println("Masukkan total belanjaan anda: ");
        double harga = scanner.nextDouble();
        System.out.println("STRUK BELANJA");
        System.out.println("=================");
        System.out.println("Nama pembeli: " +nama);
        System.out.println("Total harga belanja: Rp" + harga);
        if (harga < 100000) {
            System.out.println("Diskon yang didapatkan: 0.0%");
            double bayar = harga;
            System.out.println("Total harga yang harus dibayarkan: Rp " + bayar);
        } else if (harga >= 100000 & harga <= 199000) {
            System.out.println("Diskon yang didapatkan: 5.0%");
            double diskon = harga * 5/100;
            double bayar = harga - diskon;
            System.out.println("Total harga yang harus dibayarkan: Rp " + bayar);
        } else if (harga >= 200000 & harga <= 299000) {
            System.out.println("Diskon yang didapatkan: 10.0%");
            double diskon = harga * 10/100;
            double bayar = harga - diskon;
            System.out.println("Total harga yang harus dibayarkan: Rp " + bayar);
        } else {
            System.out.println("Diskon yang didapatkan: 20.0%");
            double diskon = harga * 20 / 100;
            double bayar = harga - diskon;
            System.out.println("Total harga yang harus dibayarkan: Rp " + bayar);
        }
    }
}