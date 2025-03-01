package PBO;

import java.util.Scanner;

public class matriks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ukuran matriks: ");
        int n = scanner.nextInt();
        int[][] matriks = new int[n][n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Masukkan angka untuk baris ke-" + (i + 1) + ": ");
                String inputBaris = scanner.nextLine();
                String[] angka = inputBaris.split(" ");
                if (angka.length != n) {
                    System.out.println("Jumlah kolom tidak sesuai, silakan masukkan " + n + " angka!");
                    continue;
                }
                boolean valid = true;
                for (int j = 0; j < n; j++) {
                    try {
                        matriks[i][j] = Integer.parseInt(angka[j]);
                    } catch (NumberFormatException e) {
                        System.out.println("Input tidak valid! Masukkan hanya angka.");
                        valid = false;
                        break;
                    }
                }
                if (valid) break;
            }
        }
        System.out.println("\nHasil matriks:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
        int nilaiTerbesar = matriks[0][0];
        int nilaiTerkecil = matriks[0][0];
        int jumlahDiagonalUtama = 0;

        for (int i = 0; i < n; i++) {
            jumlahDiagonalUtama += matriks[i][i];
            for (int j = 0; j < n; j++) {
                if (matriks[i][j] > nilaiTerbesar) {
                    nilaiTerbesar = matriks[i][j];
                }
                if (matriks[i][j] < nilaiTerkecil) {
                    nilaiTerkecil = matriks[i][j];
                }
            }
        }
        System.out.println("\nNilai maksimal adalah: " + nilaiTerbesar);
        System.out.println("Nilai minimal adalah: " + nilaiTerkecil);
        System.out.println("Jumlah diagonal utama adalah: " + jumlahDiagonalUtama);
    }
}