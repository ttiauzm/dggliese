package PBO;

import java.util.ArrayList;
import java.util.Iterator;

class Pegawai {
    String nama;
//    String posisi;
    int lamaKerja;
    double gaji;

    public Pegawai(String nama, int lamaKerja, double gaji) {
        this.nama = nama;
//        this.posisi = posisi;
        this.lamaKerja = lamaKerja;
        this.gaji = gaji;
    }

    public double getGaji(){
        return gaji;
    }

    public void ambilSlipGaji() {
        System.out.println("Slip gaji untuk " + nama + " sebesar " + getGaji());
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
        return "Nama: " + nama + ", Lama Kerja: " + lamaKerja + " tahun";
    }
}

class direktur extends Pegawai{
    public direktur(String nama, int lamaKerja, double gaji) {
        super(nama, lamaKerja, gaji);
    }
}

class manager extends Pegawai{
    public manager(String nama, int lamaKerja, double gaji) {
        super(nama, lamaKerja, gaji);
    }
}

class supervisor extends Pegawai{
    public supervisor(String nama, int lamaKerja, double gaji) {
        super(nama, lamaKerja, gaji);
    }
}

class operasional extends Pegawai{
    public operasional(String nama, int lamaKerja, double gaji) {
        super(nama, lamaKerja, gaji);
    }
}

class Kantor {
    ArrayList<Pegawai> daftarPegawai;
    double totalGaji;

    public Kantor() {
        this.daftarPegawai = new ArrayList<>();
        this.totalGaji = 0;
    }

    public void tambahPegawai(Pegawai pegawai) {
        daftarPegawai.add(pegawai);
        totalGaji += pegawai.getGaji();
    }

    public void pecatPegawai(String nama) {
        Iterator<Pegawai> iterator = daftarPegawai.iterator();
        while (iterator.hasNext()) {
            Pegawai p = iterator.next();
            if (p.nama.equals(nama)) {
                totalGaji -= p.getGaji();
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
public class TugasPegawai3 {
        public static void main(String[] args) {
            Kantor kantor = new Kantor();

            Pegawai p1 = new direktur("Budi", 10, 3000);
            Pegawai p2 = new manager("Ani", 7, 2500);
            Pegawai p3 = new supervisor("Citra", 7, 2000);
            Pegawai p4 = new operasional("Dian", 3, 1000);

            kantor.tambahPegawai(p1);
            kantor.tambahPegawai(p2);
            kantor.tambahPegawai(p3);
            kantor.tambahPegawai(p4);

            kantor.tampilkanPegawai();
            System.out.println("Rata-rata gaji: " + kantor.hitungRataRataGaji());

            p1.ambilSlipGaji();
            p2.ambilSlipGaji();
            p3.ambilSlipGaji();
            p4.ambilSlipGaji();
        }
    }

