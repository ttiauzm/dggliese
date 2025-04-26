public class Salesman extends Karyawan {
    private double penjualan;
    private double target;
    int counter = 1;
    public Salesman(String nama, double gaji, double penjualan, double target) {
        super(nama, gaji);
        this.penjualan = penjualan;
        this.target = target;
        setNik("S" + String.format("%03d", counter++));
    }

    @Override
    public double getThr() {
        if(penjualan > 1 || penjualan >= target) {
            return 2 * getGaji();
        } else {
            return getGaji();
        }
    }
}
