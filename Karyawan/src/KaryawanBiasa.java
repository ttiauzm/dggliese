public class KaryawanBiasa extends Karyawan {
    private static int counter = 1;
    public KaryawanBiasa(String nama, double gaji) {
        super(nama, gaji);
        setNik("K" + String.format("%03d", counter++));
    }
    @Override
    public double getThr() {
            return getGaji();
    }
}

