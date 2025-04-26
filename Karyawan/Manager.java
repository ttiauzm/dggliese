public class Manager extends Karyawan {
    private boolean dariPusat;
    int counter = 1;
    public Manager(String nama, double gaji, boolean dariPusat) {
        super(nama, gaji);
        this.dariPusat = dariPusat;
        setNik("M" + String.format("%03d", counter++));
    }

    @Override
    public double getThr() {
        if (dariPusat) {
            return 3 * getGaji();
        } else {
            return 2.5 * getGaji();
        }
    }
    
}
