
public class Transaksi {
    private DetailBarangTransaksi[] daftarBarang = new DetailBarangTransaksi[100];
    private Karyawan cashier;
    private String code, KodeCabang;
    private int day, year, month, hour, minute, second = 0;
    private int totalHarga = 0, totalBarang = 0, totalQty = 0;
    public int getTotalBarang() {
        return totalBarang;
    }
    Transaksi(String sCode, Karyawan kCashier, int iDay, int iYear, int imonth, int iHour, int iMinute, int iSecond) {
        code = sCode+(int )(Math.random() * 50 + 1);

        this.cashier = kCashier;
        this.day = iDay;
        this.year = iYear;
        this.month = imonth;
        this.hour = iHour;
        this.minute = iMinute;
        this.second = iSecond;
    }

    public void setKodeCabang(String sKodeCabang) {
        this.KodeCabang = sKodeCabang;
    }
    public String getKodeCabang() {
        return KodeCabang;
    }
    public void showTransaksi(int withItem) {
        System.out.println("Code Transaksi = " + this.code);
        System.out.println("Nama Cashier = " + this.cashier.getNama());
        System.out.println("Tanggal Transaksi = " + this.year + "-" + this.month + "-" + this.day + " " + this.hour
                + ":" + this.minute + ":" + this.second);

        if (withItem == 1) {
            System.out.println("----------------------------");
            if (this.daftarBarang != null) {
                for (int i = 0; i < this.totalBarang; i++) {
                    System.out.println("----------------------------");

                    System.out.println("nama : " + daftarBarang[i].getBarang().getNama());
                    System.out.println("harga : " + daftarBarang[i].getBarang().getHarga());
                    System.out.println("qty : " + daftarBarang[i].getQty());
                    System.out.println("jumlah : " + daftarBarang[i].getQty() * daftarBarang[i].getBarang().getHarga());
                }
            } else {
                System.out.println("item masih kosong");
            }
            System.out.println("----------------------------");
        }
        System.out.println("Jumlah item : " + this.totalBarang);
        System.out.println("Jumlah pembelian : " + this.totalQty);
        System.out.println("Total harga : " + this.totalHarga);
        System.out.println("=============================");

    }

    public DetailBarangTransaksi[] getDaftarBarang() {
        return daftarBarang;
    }
    
    public void  setDaftarBarang(Barang daftarBarang, int iQty) {
        totalHarga = totalHarga + daftarBarang.getHarga();
        DetailBarangTransaksi dbt = new DetailBarangTransaksi(iQty, daftarBarang);
        this.daftarBarang[totalBarang] = dbt;
        totalBarang = totalBarang + 1;
        totalQty = totalQty + iQty;
        cashier.setLbk(new LaporanBarangKaryawan(daftarBarang.getNama(), iQty, daftarBarang.getHarga(), daftarBarang.getId()));
    }

    public String getCode() {
        return code;
    }

    public void setCashier(Karyawan cashier) {
        this.cashier = cashier;
    }

    public Karyawan getCashier() {
        return cashier;
    }
}
