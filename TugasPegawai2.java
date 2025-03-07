package PBO;

import java.util.ArrayList;
import java.util.Iterator;

class Pegawai {
    String nama;
    String posisi;
    int lamaKerja;

    public Pegawai(String nama, String posisi, int lamaKerja) {
        this.nama = nama;        this.posisi = posisi;
        this.lamaKerja = lamaKerja;
    }

    public void ambilSlipGaji() {
        System.out.println("Slip gaji untuk " + nama + " dengan posisi " + posisi);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pegawai pegawai = (Pegawai) obj;
        return this.nama.equals(pegawai.nama);
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Posisi: " + posisi + ", Lama Kerja: " + lamaKerja + " tahun";
    }
}

class Kantor {
    ArrayList<Pegawai> daftarPegawai;
    double totalGaji;

    public Kantor() {
        this.daftarPegawai = new ArrayList<>();
        this.totalGaji = 0;
    }

    public void tambahPegawai(Pegawai pegawai, double gaji) {
        daftarPegawai.add(pegawai);
        totalGaji += gaji;
    }

    public void pecatPegawai(String nama) {
        Iterator<Pegawai> iterator = daftarPegawai.iterator();
        while (iterator.hasNext()) {
            Pegawai p = iterator.next();
            if (p.nama.equals(nama)) {
                iterator.remove();
                System.out.println(nama + " telah dipecat.");
                return;
            }
        }
        System.out.println("Pegawai tidak ditemukan.");
    }

    public double hitungRataRataGaji() {
        if (daftarPegawai.isEmpty()) {
            return 0;
        }
        return totalGaji / daftarPegawai.size();
    }

    public int jumlahPegawai() {
        return daftarPegawai.size();
    }

    public void tampilkanPegawai() {
        System.out.println("Daftar Pegawai di Kantor:");
        for (Pegawai p : daftarPegawai) {
            System.out.println(p);
        }
    }
}

class TugasPegawai2 {
    public static void main(String[] args) {
        Kantor kantor = new Kantor();

        Pegawai p1 = new Pegawai("Budi", "Manager", 5);
        Pegawai p2 = new Pegawai("Ani", "Staff", 2);

        kantor.tambahPegawai(p1, 7000000);
        kantor.tambahPegawai(p2, 4000000);

        kantor.tampilkanPegawai();
        System.out.println("Rata-rata gaji: " + kantor.hitungRataRataGaji());

        kantor.pecatPegawai("Ani");
        kantor.tampilkanPegawai();
    }
}
