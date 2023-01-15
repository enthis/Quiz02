public class CabangBSD extends Perusahaan {
    private String KodeCabang,Lokasi;
    private Transaksi[] daftarTransaksi = new Transaksi[100];
    private int jumlahTransaksi = 0;
    
    CabangBSD(){
        KodeCabang = "cb-bsd";
        Lokasi = "tangerang,banten";
    }

    

    public void setDaftarTransaksi(Transaksi daftarTransaksi) {
        this.daftarTransaksi[jumlahTransaksi] = daftarTransaksi;
        jumlahTransaksi = jumlahTransaksi + 1;
    }

    public void showDaftarTransaksi() {
        for (int i = 0; i < jumlahTransaksi; i++) {
            daftarTransaksi[i].showTransaksi(0);
        }
    }

    public Transaksi[] getDaftarTransaksi() {
        return daftarTransaksi;
    }
        
    public String getKodeCabang() {
        return KodeCabang;
    }
    public String getLokasi() {
        return Lokasi;
    }
    public void showCabang() {
        System.out.println("Kode Cabang : "+this.KodeCabang);
        System.out.println("Lokasi : " + this.Lokasi);
        System.out.println("Jumlah Transaksi :"+this.jumlahTransaksi);
        System.out.println("=============================");
    }
}
