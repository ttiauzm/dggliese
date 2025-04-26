public abstract class Karyawan {
    private String nama;
    private String nik;
    private double gaji;
    private int jumlahCuti = 12;

    public Karyawan(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void tambahCuti(int hari) {
        jumlahCuti += hari;
    }

    public int getJumlahCuti() {
        return jumlahCuti;
    }

    public void tambahCuti(String tipe, String jenisKelamin) {
        switch (tipe.toLowerCase()) {
            case "pernikahan":
                jumlahCuti += 2;
            case "melahirkan":
                if (jenisKelamin.equalsIgnoreCase("Wanita")) {
                    jumlahCuti += 90;
                } else {
                    jumlahCuti += 3;
                }
        }
    }

    public abstract double getThr();
}