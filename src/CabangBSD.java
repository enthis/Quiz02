public class CabangBSD extends Perusahaan {
    private String KodeCabang,Lokasi;
    
    CabangBSD(){
        this.KodeCabang = "cb-bsd";
        Lokasi = "tangerang,banten";
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
