package PBO;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class kendaraan {
    private String platNomor;
    private String jenisKendaraan;
    private int jamMasuk;

    public kendaraan(String platNomor, String jenisKendaraan, int jamMasuk) {
        this.platNomor = platNomor;
        this.jenisKendaraan = jenisKendaraan;
        this.jamMasuk = jamMasuk;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public int getJamMasuk() {
        return jamMasuk;
    }

    public void setJamMasuk(int jamMasuk) {
        this.jamMasuk = jamMasuk;
    }
}

class motor extends kendaraan {
    public motor(String platNomor, int jamMasuk) {
        super(platNomor, "Motor", jamMasuk);
    }
}

class mobil extends kendaraan {
    public mobil(String platNomor, int jamMasuk) {
        super(platNomor, "Mobil", jamMasuk);
    }
}

class parkir {
    private ArrayList<kendaraan> slotParkir = new ArrayList<>();
    private int kapasitas = 12;
    private int biayaMotor = 2000;
    private int biayaMobil = 5000;
    private int kendaraanKeluar = 0;
    private int totalPendapatan;

    public void lihatStatusParkir(){
        if (this.slotParkir.isEmpty()){
            System.out.println("Parkiran masih kosong");
        } else {
            for (kendaraan k:slotParkir){
                System.out.println("Plat: " + k.getPlatNomor()+", jenis: " + k.getJenisKendaraan() + ", jam masuk: " + k.getJamMasuk());
            }
        }
    }

    public void tambahKendaraan(kendaraan kendaraan){
        if(slotParkir.size()<kapasitas){
            slotParkir.add(kendaraan);
            System.out.println("Kendaraan "+ kendaraan.getPlatNomor()+" berhasil diparkir");
        } else{
            System.out.println("Parkiran penuh");
        }
    }

    public void keluarKendaraan(String platNomor, int jamKeluar) {
        for (kendaraan k:slotParkir){
            if (k.getPlatNomor().equals(platNomor)){
                int durasi = jamKeluar - k.getJamMasuk();
                if (k.getJenisKendaraan().equals("Motor")) {
                    int biaya = durasi * biayaMotor;
                    totalPendapatan += biaya;
                    System.out.println("Kendaraan "+platNomor+" berhasil keluar. Total biaya: Rp " + biaya);
                } else{
                    int biaya = durasi * biayaMobil;
                    totalPendapatan += biaya;
                    System.out.println("Kendaraan "+platNomor+" berhasil keluar. Total biaya: Rp "+biaya);
                }
                kendaraanKeluar++;
                slotParkir.remove(k);
                return;
            }
        }
        System.out.println("Kendaraan tidak ditemukan");
    }

    public void pindahKendaraan(String platNomor, int indexBaru) {
        if (indexBaru < 0 || indexBaru >= slotParkir.size()) {
            System.out.println("Slot tujuan tidak valid");
            return;
        }

        kendaraan kendaraanDipindah = null;
        int indexLama = -1;

        for (int i = 0; i < slotParkir.size(); i++) {
            if (slotParkir.get(i).getPlatNomor().equals(platNomor)) {
                kendaraanDipindah = slotParkir.get(i);
                indexLama = i;
                break;
            }
        }

        if (kendaraanDipindah == null) {
            System.out.println("Kendaraan tidak ditemukan");
            return;
        }

        if (kendaraanDipindah instanceof mobil) {
            for (int i = indexBaru; i >= 0; i--) {
                if (slotParkir.get(i) instanceof motor) {
                    System.out.println("Mobil tidak bisa ditempatkan di bawah motor");
                    return;
                }
            }
        }
        slotParkir.remove((indexLama));
        slotParkir.add(indexBaru, kendaraanDipindah);
        System.out.println("Kendaraan " + platNomor + " berhasil dipindahkan ke slot " + indexBaru);
    }

    public void exit() {
        if(kendaraanKeluar==0){
            System.out.println("Parkiran sepi hari ini, semoga besok lebih ramai");
        } else{
            System.out.println("Jumlah kendaraan yang keluar: "+ kendaraanKeluar);
            System.out.println("Total pendapatan: Rp "+ totalPendapatan);
        }
    }
}

public class sistemParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        parkir p = new parkir();

        while (true){
            System.out.println("\n=== Selamat datang di sistem manajemen parkir ===");
            System.out.println("1. Lihat status parkir");
            System.out.println("2. Tambah kendaraan");
            System.out.println("3. Keluar kendaraan");
            System.out.println("4. Pindah kendaraan");
            System.out.println("5. Exit");
            System.out.println("Masukkan pilihan anda (1-5): ");
            int pilihan = scanner.nextInt();

            switch (pilihan){
                case 1:
                    p.lihatStatusParkir();
                    break;
                case 2:
                    System.out.println("Masukkan nomor plat: ");
                    String plat = scanner.next();
                    System.out.println("Masukkan jenis kendaraan: ");
                    String jenis = scanner.next();
                    System.out.println("Masukkan jam masuk: ");
                    int jamMasuk = scanner.nextInt();
                    if (Objects.equals(jenis, "Motor")){
                        p.tambahKendaraan(new motor(plat, jamMasuk));
                    } else if (Objects.equals(jenis, "Mobil")) {
                        p.tambahKendaraan(new mobil(plat, jamMasuk));
                    } else {
                        System.out.println("Jenis kendaraan tidak valif");
                    }
                    break;
                case 3:
                    System.out.println("Masukkan nomor plat kendaraan yang akan keluar: ");
                    String platKeluar = scanner.next();
                    System.out.println("Masukkan jam keluar: ");
                    int jamKeluar = scanner.nextInt();
                    p.keluarKendaraan(platKeluar, jamKeluar);
                    break;
                case 4:
                    System.out.println("Masukkan nomor plat kendaraan yang akan dipindahkan: ");
                    String platPindah = scanner.next();
                    System.out.println("Masukkan index tujuan: ");
                    int indexTujuan = scanner.nextInt();
                    p.pindahKendaraan(platPindah, indexTujuan);
                    break;
                case 5:
                    p.exit();
                    return;
            }
        }
    }
}