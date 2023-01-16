public class Karyawan {
    private int gaji,jumlahTransaksi,jumlahLaporanBarang = 0;
    private String nama;
    protected Transaksi[] daftarTransaksi = new Transaksi[100];
    private LaporanBarangKaryawan[] lbk = new LaporanBarangKaryawan[100];
    private LaporanBarangKaryawan getLbkByItemId(int iIdBarang ){
        for (int i = 0; i < jumlahLaporanBarang; i++) {
            if(lbk[i].getiIdBarang() == iIdBarang){
                return lbk[i];
            }
        }
        return null;
    }
    public void setLbk(LaporanBarangKaryawan lLbk) {
        LaporanBarangKaryawan lbks = getLbkByItemId(lLbk.getiIdBarang());
        if(lbks == null){
            lbk[jumlahLaporanBarang] = lLbk;
            jumlahLaporanBarang = jumlahLaporanBarang + 1;
        }else{
            lbks.setJumlahBarang(lbks.getJumlahBarang() + lLbk.getJumlahBarang());
        }
    }
    public void showLaporanBarangKaryawans(){
        for (int i = 0; i < jumlahLaporanBarang; i++) {
            lbk[i].showLaporanBarangKaryawan();
        }
    }
    Karyawan(String sNama){
        gaji = 0;
        nama = sNama;
        jumlahTransaksi = 0;
    }
    public void setDaftarTransaksi(Transaksi tTransaksi) {
        daftarTransaksi[jumlahTransaksi] = tTransaksi;
        jumlahTransaksi = jumlahTransaksi + 1;
    }
    public int getJumlahTransaksi() {
        return jumlahTransaksi;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getGaji() {
        return gaji;
    }
    public String getNama() {
        return nama;
    }
}
