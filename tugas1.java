import java.util.Scanner;

public class tugas1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Masukkan nama: ");
        String name = scanner.nextLine();
        System.out.println("Masukkan usia: ");
        int usia = scanner.nextInt();
        while (true) {
            System.out.println("Masukkan NIK: ");
            long nik = scanner.nextLong();
            long x = String.valueOf(nik).length();
            if (x == 16) {
                break;
            } else {
                System.out.println("NIK tidak valid");
            }
        }
        System.out.println("Masukkan IPK: ");
        double ipk = scanner.nextDouble();
            if (ipk < 3.5) {
                System.out.println("Anda tidak memenuhi persyaratan beasiswa");
            } else {
                System.out.println("Anda memenuhi persyaratan beasiswa");
            }
    }
}