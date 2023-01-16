public class CabangBekasi extends Perusahaan {
    
        
    private String KodeCabang,Lokasi;
    private int jumlahKaryawan = 0,jumlahLPP = 0;
    private Karyawan[] listKaryawans = new Karyawan[10];
    private LaporanPendapatanPerhari[] lpp = new LaporanPendapatanPerhari[100];
    private LaporanPendapatanPerhari getLbkByItemId(int iIdBarang ){
        for (int i = 0; i < jumlahLPP; i++) {
            if(lpp[i].getiIdBarang() == iIdBarang){
                return lpp[i];
            }
        }
        return null;
    }
    public void setLbk(LaporanPendapatanPerhari lLbk) {
        LaporanPendapatanPerhari lbks = getLbkByItemId(lLbk.getiIdBarang());
        if(lbks == null){
            lpp[jumlahLPP] = lLbk;
            jumlahLPP = jumlahLPP + 1;
        }else{
            lbks.setJumlahBarang(lbks.getJumlahBarang() + lLbk.getJumlahBarang());
        }
    }
    public void showLaporanPendapatanPerharis(){
        for (int i = 0; i < jumlahLPP; i++) {
            lpp[i].showLaporanPendapatanPerhari();
        }
    }
    public void showLaporanPendapatanPerBulan(){
        for (int i = 0; i < jumlahLPP; i++) {
            lpp[i].showLaporanPendapatanPerBulan();
        }
    }
    public void setListKaryawans(Karyawan kKaryawan) {
        listKaryawans[jumlahKaryawan] = kKaryawan;
        jumlahKaryawan = jumlahKaryawan + 1;
    }
    protected void addKaryawan(){
        Karyawan ks = new Karyawan("bejo");
        Karyawan ks1 = new Karyawan("leo");
        Karyawan ks3 = new Karyawan("desta");
        this.setListKaryawans(ks3);
        this.setListKaryawans(ks1);
        this.setListKaryawans(ks);
    }
    public Karyawan getKaryawanByName(String sNama) {
        for (int i = 0; i < jumlahKaryawan; i++) {
            if (sNama == listKaryawans[i].getNama()) {
                return listKaryawans[i];
            } 
        }
        return null;
    }
      
    CabangBekasi(){
        addKaryawan();
        this.KodeCabang = "cb-bekasi";
        Lokasi = "bekasi,jawa barat";
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
