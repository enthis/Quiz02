public class CabangBekasi extends Perusahaan {
    private String KodeCabang,Lokasi;
    
    CabangBekasi(){
        this.KodeCabang = "cb-bekasi";
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
