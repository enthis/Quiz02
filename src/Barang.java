public class Barang {
    String nama;
    int harga;
    Barang(String sNama,int iHarga){
        nama = sNama;
        harga = iHarga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getHarga() {
        return harga;
    }
    public String getNama() {
        return nama;
    }
}
