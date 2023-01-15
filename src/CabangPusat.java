public class CabangPusat extends Perusahaan {
    String KodeCabang,Lokasi;
    
    CabangPusat(){
        KodeCabang = "cb-pusat";
        Lokasi = "jakarta selatan,jakarta";
    }
    
    public String getKodeCabang() {
        return KodeCabang;
    }
    public String getLokasi() {
        return Lokasi;
    }
}
