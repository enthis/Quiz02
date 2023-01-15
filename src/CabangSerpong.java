public class CabangSerpong extends Perusahaan {
    String KodeCabang,Lokasi;
    
    CabangSerpong(){
        KodeCabang = "cb-serpong";
        Lokasi = "serpong,banten";
    }
    
    public String getKodeCabang() {
        return KodeCabang;
    }
    public String getLokasi() {
        return Lokasi;
    }
}
