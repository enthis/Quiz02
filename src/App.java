public class App {
    public static void main(String[] args) throws Exception {
        
        CabangBSD cBsd = new CabangBSD();
        cBsd.showDaftarBarang();
        Karyawan kKaryawan = new Karyawan(500,"Karyawan BSD");
        Transaksi ts1 = new Transaksi("ts1",kKaryawan,15,2022,1,15,15,0);
        ts1.setDaftarBarang(cBsd.getBarangById(1), 2);
        ts1.setDaftarBarang(cBsd.getBarangById(2), 2);
        ts1.setDaftarBarang(cBsd.getBarangById(4), 2);
        
        Karyawan kKaryawan2 = new Karyawan(1500,"Karyawan BSD 2");
        Transaksi ts2 = new Transaksi("ts2",kKaryawan2,15,2022,1,15,56,0);
        ts2.setDaftarBarang(cBsd.getBarangById(1), 2);

        cBsd.setDaftarTransaksi(ts1);
        cBsd.setDaftarTransaksi(ts2);
        cBsd.showCabang();
        cBsd.showDaftarTransaksi();
    }
}
