public class DetailBarangTransaksi {
    private int qty = 0;
    private Barang barang;
    
    DetailBarangTransaksi(int iQty,Barang bBarang){
        this.qty = iQty;
        this.barang = bBarang;
    }
    public Barang getBarang() {
        return barang;
    }
    public int getQty() {
        return qty;
    }
}
