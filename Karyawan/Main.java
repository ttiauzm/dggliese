public class Main {
    public static void main(String[] args) {

        KaryawanBiasa biasa = new KaryawanBiasa("Andy", 5000000);
        System.out.println("=== Karyawan Biasa ===");
        System.out.println("NIK: " + biasa.getNik());
        System.out.println("Nama: " + biasa.getNama());
        System.out.println("Gaji: " + biasa.getGaji());
        System.out.println("THR: " + biasa.getThr());
        System.out.println("Cuti: " + biasa.getJumlahCuti());
        biasa.tambahCuti("pernikahan", "laki-laki");
        System.out.println("Cuti setelah ditambah: " + biasa.getJumlahCuti());

        Manager mp = new Manager("Boni", 9000000, true);
        System.out.println("\n=== Manager Pusat ===");
        System.out.println("NIK: " + mp.getNik());
        System.out.println("Nama: " + mp.getNama());
        System.out.println("Gaji: " + mp.getGaji());
        System.out.println("THR: " + mp.getThr());
        System.out.println("Cuti: " + mp.getJumlahCuti());
        mp.tambahCuti("pernikahan", "laki-laki");
        System.out.println("Cuti setelah ditambah: " + mp.getJumlahCuti());

        Manager mc = new Manager("Ceysa", 8000000, false);
        System.out.println("\n=== Manager Cabang ===");
        System.out.println("NIK: "+ mc.getNik());
        System.out.println("Nama: " + mc.getNama());
        System.out.println(("Gaji: " + mp.getGaji()));
        System.out.println("THR: " + mc.getThr());
        System.out.println("Cuti: "+ mc.getJumlahCuti());
        mc.tambahCuti("melahirkan", "wanita");
        System.out.println("Cuti setelah ditambah: " + mc.getJumlahCuti());

        Salesman s = new Salesman("Diandra", 7000000, 3, 2);
        System.out.println("\n=== Salesman ===");
        System.out.println("NIK: " + s.getNik());
        System.out.println("Nama: " + s.getNama());
        System.out.println(("Gaji: " + s.getGaji()));
        System.out.println("THR: " + s.getThr());
        System.out.println("Cuti: "+ s.getJumlahCuti());
    }
}