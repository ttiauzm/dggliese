package PBO;

import java.util.ArrayList;
import java.util.Scanner;

public class rataan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Masukkan size array: ");
        int array = scanner.nextInt();
        System.out.println("Masukkan angka array: ");
        ArrayList<Integer>final_angka = new ArrayList<>();
        int jumlah = 0;
        for (int i = 0; i<array; i++) {
            System.out.println("Angka " + (i+1) + ":");
            int angka_array = scanner.nextInt();
            final_angka.add(angka_array);
            jumlah += angka_array;
        }
        String hasil = "final array: " + String.join(", ", final_angka.stream().map(String::valueOf).toArray(String[]::new));
        System.out.println(hasil);
        float rataan = (float) jumlah / array;
        System.out.println("Rata-rata: " + rataan);
        boolean is_bigger = false;
        for (int i=0; i< final_angka.size();i++){
            if (final_angka.get(i)>rataan){
                System.out.println("Angka yang lebih besar dari rata-rata adalah: " + final_angka.get(i));
                is_bigger = true;
                break;
            }
        System.out.println("Tidak ada angka yang lebih besar dari rata-rata");
        }
    }
}