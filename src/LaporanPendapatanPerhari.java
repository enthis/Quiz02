public class LaporanPendapatanPerhari {
    private String namaBarang;
    private int jumlahBarang, harga, iIdBarang, hargaBeli;

    LaporanPendapatanPerhari(String sNamaBarang, int iJumlahBarang, int iHarga, int iIdBarang, int iHargaBeli) {
        setHarga(iHarga);
        setNamaBarang(sNamaBarang);
        setJumlahBarang(iJumlahBarang);
        setiIdBarang(iIdBarang);
        setHargaBeli(iHargaBeli);
    }

    public int getHargaBeli() {
        return hargaBeli;
    }

    public void setHargaBeli(int hargaBeli) {
        this.hargaBeli = hargaBeli;
    }

    public void showLaporanPendapatanPerhari() {
        System.out.println("Nama Barang :" + getNamaBarang());
        System.out.println("Jumlah Barang :" + getJumlahBarang());
        System.out.println("Harga Beli :" + getHargaBeli());
        System.out.println("Harga Barang :" + getHarga());
        System.out.println("Prosentase Karyawan(10%) :"
                + String.format("%.2f", (getHarga() * getJumlahBarang() * (10.0f / 100.0f))));
        System.out.println("----------------------------------");
    }
    public void showLaporanPendapatanPerBulan(){
        System.out.println("Nama Barang :"+getNamaBarang());
        System.out.println("Jumlah Barang :"+getJumlahBarang());
        System.out.println("Harga Beli :"+getHargaBeli());
        System.out.println("Harga Barang :"+getHarga());
        System.out.println("Prosentase Karyawan(10%) :"+String.format("%.2f",(getHarga() *getJumlahBarang() * (10.0f/100.0f))));
        System.out.println("Harga bersih :"+String.format("%.2f",(getHarga() * getJumlahBarang()) - ((getHargaBeli() * getJumlahBarang())+(getHarga() *getJumlahBarang() * (10.0f/100.0f)))));
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
