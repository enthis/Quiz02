public class CabangBekasi extends Perusahaan {
    String KodeCabang,Lokasi;
    
    CabangBekasi(){
        KodeCabang = "cb-bekasi";
        Lokasi = "bekasi,jawa barat";
    }
    
    public String getKodeCabang() {
        return KodeCabang;
    }
    public String getLokasi() {
        return Lokasi;
    }
}
