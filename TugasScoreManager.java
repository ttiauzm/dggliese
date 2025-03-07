package PBO;

class Score {
    String anak;
    int nilai;
    public Score(String anak, int nilai) {
        this.anak = anak;
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return "Anak = " + anak + ", Score = " + nilai;
    }
}
class ScoreManager {
    Score[] daftarScore;
    int jumlahAnak;

    public ScoreManager(int kapasitas) {
        daftarScore = new Score[kapasitas];
        jumlahAnak = 0;
    }

    public void tambahScore(String anak, int nilai) {
        if (jumlahAnak < daftarScore.length) {
            daftarScore[jumlahAnak++] = new Score(anak, nilai);
        } else {
            System.out.println("Kapasitas penuh! Tidak dapat menambahkan skor baru.");
        }
    }

    public int hitungTotal() {
        int total = 0;
        for (int i = 0; i < jumlahAnak; i++) {
            total += daftarScore[i].nilai;
        }
        return total;
    }

    public double hitungRataRata() {
        if (jumlahAnak == 0) return 0;
        return (double) hitungTotal() / jumlahAnak;
    }

    public int cariNilaiTertinggi() {
        if (jumlahAnak == 0) return 0;
        int max = daftarScore[0].nilai;
        for (int i = 1; i < jumlahAnak; i++) {
            if (daftarScore[i].nilai > max) {
                max = daftarScore[i].nilai;
            }
        }
        return max;
    }

    public int cariNilaiTerendah() {
        if (jumlahAnak == 0) return 0;
        int min = daftarScore[0].nilai;
        for (int i = 1; i < jumlahAnak; i++) {
            if (daftarScore[i].nilai < min) {
                min = daftarScore[i].nilai;
            }
        }
        return min;
    }

    public int hitungSelisihTertinggiTerendah() {
        return cariNilaiTertinggi() - cariNilaiTerendah();
    }

    public void tampilkanScore() {
        for (int i = 0; i < jumlahAnak; i++) {
            System.out.println(daftarScore[i]);
        }
    }
}

public class TugasScoreManager {
    public static void main(String[] args) {
        ScoreManager manager = new ScoreManager(10);

        manager.tambahScore("Ayam", 50);
        manager.tambahScore("Bebek", 7);
        manager.tambahScore("Kucing", 90);
        manager.tambahScore("Anjing", 30);

        manager.tampilkanScore();
        System.out.println("Total Score: " + manager.hitungTotal());
        System.out.println("Rata-rata Score: " + manager.hitungRataRata());
        System.out.println("Nilai Tertinggi: " + manager.cariNilaiTertinggi());
        System.out.println("Nilai Terendah: " + manager.cariNilaiTerendah());
        System.out.println("Selisih Nilai Tertinggi dan Terendah: " + manager.hitungSelisihTertinggiTerendah());
    }
}
