public class App {
    public static void main(String[] args) throws Exception {
        //membuat object barang
        Barang Lulur = new Barang("Lulur", 2500);
        Barang Crembath = new Barang("Crembath", 1500);
        Barang Ficial = new Barang("Ficial", 5000);
        Barang PerawatanPenganten = new Barang("Perawatan Penganten", 8500);
        Barang MakeupAcaraPesta = new Barang("Makeup acara pesta", 50000);
        Barang PewarnaanRambut  = new Barang("Pewarnaan Rambut ", 55000);
        Barang MenikurDanPedikur  = new Barang("Menikur dan pedikur", 170);
        Barang PotongRambut = new Barang("Potong rambut", 3500);
        Barang BlicingBody = new Barang("Blicing body, [dgn suntik vit.C, Vit.E, & Kolagen", 15000);

        Karyawan kKaryawan = new Karyawan(500,"Karyawan BSD");
        Transaksi ts1 = new Transaksi("ts1",kKaryawan,15,2022,1,15,15,0);
        ts1.setDaftarBarang(Crembath,1);
        ts1.setDaftarBarang(Lulur,2);

        
        Karyawan kKaryawan2 = new Karyawan(1500,"Karyawan BSD 2");
        Transaksi ts2 = new Transaksi("ts2",kKaryawan2,15,2022,1,15,56,0);
        ts2.setDaftarBarang(Ficial,3);
        ts2.setDaftarBarang(PerawatanPenganten,4);
        ts2.setDaftarBarang(MakeupAcaraPesta,1);

        CabangBSD cBsd = new CabangBSD();
        cBsd.setDaftarTransaksi(ts1);
        cBsd.setDaftarTransaksi(ts2);
        cBsd.showCabang();
        cBsd.showDaftarTransaksi();
    }
}
