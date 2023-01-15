public class App {
    public static void main(String[] args) throws Exception {
        Barang Crembath = new Barang("Crembath", 400);
        Transaksi ts1 = new Transaksi("ts1");
        ts1.setDaftarBarang(Crembath);
        ts1.showTransaksi();
    }
}
