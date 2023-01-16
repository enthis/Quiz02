public class LaporanBarangKaryawan {
    private String namaBarang;
    private int jumlahBarang, harga, iIdBarang;

    LaporanBarangKaryawan(String sNamaBarang, int iJumlahBarang, int iHarga, int iIdBarang) {
        setHarga(iHarga);
        setNamaBarang(sNamaBarang);
        setJumlahBarang(iJumlahBarang);
        setiIdBarang(iIdBarang);
    }

    public void showLaporanBarangKaryawan(){
        System.out.println("Nama Barang :"+getNamaBarang());
        System.out.println("Jumlah Barang :"+getJumlahBarang());
        System.out.println("Harga Barang :"+getHarga());
        System.out.println("Prosentase Karyawan(10%) :"+String.format("%.2f",(getHarga() *getJumlahBarang() * (10.0f/100.0f))));
        System.out.println("----------------------------------");
    }

    public void setiIdBarang(int iIdBarang) {
        this.iIdBarang = iIdBarang;
    }

    public int getiIdBarang() {
        return iIdBarang;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }
}
