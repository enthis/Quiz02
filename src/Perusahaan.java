import java.util.Arrays;

public class Perusahaan {
    private Barang[] daftBarangs = new Barang[20];
    private int jumlahMasterBarang = 0;
    protected Transaksi[] daftarTransaksi = new Transaksi[100];
    protected int jumlahTransaksi = 0;

    Perusahaan() {
        // membuat object barang
        Barang Lulur = new Barang(1, "Lulur", 2500, "Rempah2", "250 (1kg : 100x pakai)=2500", 150000);
        Barang Crembath = new Barang(2, "Crembath", 1500, "Rempah2", "150 (1kg : 100x pakai)=1500", 100000);
        Barang Ficial = new Barang(3, "Ficial", 5000, "Rempah2", "100 (1kg : 50x pakai)=5000", 150000);
        Barang PerawatanPenganten = new Barang(4, "Perawatan Penganten", 8500, "Rempah2", "70 (1kg : 50x pakai)=3500",
                20000);
        Barang MakeupAcaraPesta = new Barang(5, "Makeup acara pesta", 50000, "Rempah2", "750 (1kg : 200x pakai)=15000",
                200000);
        Barang PewarnaanRambut = new Barang(6, "Pewarnaan Rambut ", 55000, "Rempah2", "850 (1kg : 100x pakai)=8500",
                15000000);
        Barang MenikurDanPedikur = new Barang(7, "Menikur dan pedikur", 170, "Rempah2", "250 (1kg : 200x pakai)=50000",
                150000);
        Barang PotongRambut = new Barang(8, "Potong rambut", 3500, "Rempah2", "275 (1kg : 200x pakai)=55000", 125000);
        Barang BlicingBody = new Barang(9, "Blicing body, [dgn suntik vit.C, Vit.E, & Kolagen", 15000, "Rempah2",
                "75 (1kg: 100x pakai)=170", 180000);
        this.setDaftBarangs(BlicingBody);
        this.setDaftBarangs(PotongRambut);
        this.setDaftBarangs(MenikurDanPedikur);
        this.setDaftBarangs(PewarnaanRambut);
        this.setDaftBarangs(MakeupAcaraPesta);
        this.setDaftBarangs(PerawatanPenganten);
        this.setDaftBarangs(Ficial);
        this.setDaftBarangs(Crembath);
        this.setDaftBarangs(Lulur);
    }

    protected void showDaftarTransaksi() {
        for (int i = 0; i < jumlahTransaksi; i++) {
            daftarTransaksi[i].showTransaksi(0);
            System.out.println("----------------------------");

        }
    }

    protected void setDaftarTransaksi(Transaksi daftarTransaksi) {
        this.daftarTransaksi[jumlahTransaksi] = daftarTransaksi;
        this.jumlahTransaksi = this.jumlahTransaksi + 1;
        daftarTransaksi.getCashier().setDaftarTransaksi(daftarTransaksi);
        

    }

    protected void setDaftarTransaksi(Transaksi[] daftarTransaksi) {
        this.daftarTransaksi = daftarTransaksi;
    }

    protected void setDaftBarangs(Barang bBarang) {
        daftBarangs[jumlahMasterBarang] = bBarang;
        jumlahMasterBarang = jumlahMasterBarang + 1;
    }

    protected void showDaftarBarang() {
        for (int i = 0; i < jumlahMasterBarang; i++) {
            System.out.println("id : " + daftBarangs[i].getId());
            System.out.println("nama :" + daftBarangs[i].getNama());
            System.out.println("bahan : " + daftBarangs[i].getNamaBahan());
            System.out.println("Harga Bahan : " + daftBarangs[i].getDetailHargaBahan());
            System.out.println("Harga Beli : " + daftBarangs[i].getHargaModal());
            System.out.println("Harga Jual : " + daftBarangs[i].getHarga());
            System.out.println("----------------------------");

        }
    }

    protected Barang getBarangById(int iIdBarang) {
        for (int i = 0; i < jumlahMasterBarang; i++) {
            if (this.daftBarangs[i].getId() == iIdBarang) {
                return this.daftBarangs[i];
            }
        }
        return null;
    }

    protected Transaksi[] getDaftarTransaksi() {
        return daftarTransaksi;
    }

    protected void laporanTransaksiPerHari() {
        System.out.println("laporan transaksi per hari");
    }


    protected void laporanKaryawanPerBulan() {
        System.out.println("laporan pendapatan Perbulan");
        String[] listNamaKaryawan = new String[100];
        int jmlListNamaKaryawan = 0;
        for (int i = 0; i < jumlahTransaksi; i++) {
            if (!Arrays.stream(listNamaKaryawan).anyMatch(daftarTransaksi[i].getCashier().getNama()::equals)) {
                System.out.println("Nama Karyawan : "+daftarTransaksi[i].getCashier().getNama());
                daftarTransaksi[i].getCashier().showLaporanBarangKaryawans();
                listNamaKaryawan[jmlListNamaKaryawan] = daftarTransaksi[i].getCashier().getNama();

                jmlListNamaKaryawan = jmlListNamaKaryawan + 1;
            }
        }

    }
}
