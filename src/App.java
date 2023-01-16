import java.util.*;
import java.util.stream.Collectors;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class App {
    private int[] getCurrentDatetime() {
        int[] now = new int[6];
        LocalDateTime nows = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
        String sNow = nows.format(format);
        String[] sNows = sNow.split("-");
        for (int i = 0; i < sNows.length; i++) {
            now[i] = Integer.parseInt(sNows[i]);
        }
        return now;
    }

    public static void main(String[] args) throws Exception {
        App p = new App();
        System.out.println(java.util.Calendar.getInstance().getTime());
        Scanner sc = new Scanner(System.in);
        CabangBSD cBsd = new CabangBSD();
        CabangBekasi cBekasi = new CabangBekasi();
        CabangPusat cPusat = new CabangPusat();
        CabangSerpong cSerpong = new CabangSerpong();

        int[] transactionDateTime2 = p.getCurrentDatetime();

        String result2 = Arrays.stream(transactionDateTime2).mapToObj(String::valueOf)
                .collect(Collectors.joining(""));
        Transaksi ts1 = new Transaksi(result2, cPusat.getKaryawanByName("leo"), transactionDateTime2[0],
                transactionDateTime2[2],
                transactionDateTime2[1], transactionDateTime2[3], transactionDateTime2[4], transactionDateTime2[5]);
        
        Barang tmp = cPusat.getBarangById(1);
        ts1.setDaftarBarang(tmp, 2);
        cPusat.setLbk(new LaporanPendapatanPerhari(tmp.getNama(), 2, tmp.getHarga(), tmp.getId(), tmp.getHargaModal()));
        tmp = cPusat.getBarangById(2);
        ts1.setDaftarBarang(tmp, 2);
        cPusat.setLbk(new LaporanPendapatanPerhari(tmp.getNama(), 2, tmp.getHarga(), tmp.getId(), tmp.getHargaModal()));
        tmp = cPusat.getBarangById(4);
        ts1.setDaftarBarang(cPusat.getBarangById(4), 10);
        cPusat.setLbk(new LaporanPendapatanPerhari(tmp.getNama(), 10, tmp.getHarga(), tmp.getId(), tmp.getHargaModal()));

        transactionDateTime2 = p.getCurrentDatetime();
        result2 = Arrays.stream(transactionDateTime2).mapToObj(String::valueOf)
                .collect(Collectors.joining(""));
        ts1 = new Transaksi(result2, cPusat.getKaryawanByName("leo"), transactionDateTime2[0], transactionDateTime2[2],
                transactionDateTime2[1], transactionDateTime2[3], transactionDateTime2[4], transactionDateTime2[5]);
        tmp = cPusat.getBarangById(1);
        ts1.setDaftarBarang(tmp, 2);
        cPusat.setLbk(new LaporanPendapatanPerhari(tmp.getNama(), 2, tmp.getHarga(), tmp.getId(), tmp.getHargaModal()));
        tmp = cPusat.getBarangById(1);
        ts1.setDaftarBarang(tmp, 2);
        cPusat.setLbk(new LaporanPendapatanPerhari(tmp.getNama(), 2, tmp.getHarga(), tmp.getId(), tmp.getHargaModal()));
        tmp = cPusat.getBarangById(4);
        ts1.setDaftarBarang(cPusat.getBarangById(4), 10);
        cPusat.setLbk(new LaporanPendapatanPerhari(tmp.getNama(), 10, tmp.getHarga(), tmp.getId(), tmp.getHargaModal()));
        cPusat.setDaftarTransaksi(ts1);
        do {
            int menu = 0, cabangTerpilih = 0;
            String namaCabang;
            System.out.println("Aplikasi Toko Skin Care");
            do {
                System.out.println("Pilih Cabang :");
                System.out.println("1. Cabang Pusat");
                System.out.println("2. Cabang BSD");
                System.out.println("3. Cabang Bekasi");
                System.out.println("4. Cabang Serpong");
                System.out.print("Pilih Cabang :");
                cabangTerpilih = sc.nextInt();
                System.out.println("cabangTerpilih " + cabangTerpilih);
                if (cabangTerpilih == 1) {
                    namaCabang = "Cabang Pusat";
                    break;
                } else if (cabangTerpilih == 2) {
                    namaCabang = "Cabang BSD";
                    break;
                } else if (cabangTerpilih == 3) {
                    namaCabang = "Cabang Bekasi";
                    break;
                } else if (cabangTerpilih == 4) {
                    namaCabang = "Cabang Serpong";
                    break;
                } else {
                    System.out.println("Cabang tidak di temukan");
                }

            } while (true);
            System.out.println(namaCabang);
            do {
                System.out.println("Pilih Menu");
                System.out.println("1. Buat Transaksi");
                System.out.println("2. Tampilkan Transaksi");
                System.out.println("3. Tampilkan Pendapatan PerHari");
                System.out.println("4. Tampilkan Karyawan PerBulan");
                System.out.print("Pilih Menu : ");
                menu = sc.nextInt();
                break;
            } while (true);
            if (menu == 1) {
                cPusat.showDaftarBarang();
                System.out.print("Masukan Nama Kasir :");
                String namaKasir = sc.next();
                Karyawan cashier = new Karyawan(namaKasir);
                int[] transactionDateTime = p.getCurrentDatetime();

                String result = Arrays.stream(transactionDateTime).mapToObj(String::valueOf)
                        .collect(Collectors.joining(""));
                Transaksi ts = new Transaksi(result, cashier, transactionDateTime[0], transactionDateTime[2],
                        transactionDateTime[1], transactionDateTime[3], transactionDateTime[4], transactionDateTime[5]);
                do {
                    System.out.print("Masukan Id Barang (ketik 0 untuk selesai) : ");
                    int productId = sc.nextInt();
                    if (productId == 0)
                        break;
                    System.out.print("Jumlah : ");
                    int qty = sc.nextInt();
                    Barang br = cPusat.getBarangById(productId);
                    ts.setDaftarBarang(br, qty);
                } while (true);
                cPusat.setDaftarTransaksi(ts);

            } else if (menu == 2) {
                cPusat.showDaftarTransaksi();
                System.out.println(menu);
            } else if (menu == 3) {
                cPusat.showLaporanPendapatanPerharis();
            } else if (menu == 4) {
                cPusat.showLaporanPendapatanPerBulan();
            } else {
                System.out.println("Pilihan menu salah");
            }
            System.in.read();
        } while (true);
    }
}
