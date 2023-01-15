public class Transaksi {
    Barang[] daftarBarang = new Barang[100];
    Karyawan cashier;
    String code;
    int totalHarga = 0;

    Transaksi(String sCode) {
        code = sCode;
    }

    public void showTransaksi() {
        if (this.daftarBarang != null) {

            for (int i = 0; i < daftarBarang.length; i++) {
                System.out.println("nama : " + daftarBarang[i].nama);
                System.out.println("harga : " + daftarBarang[i].harga);
            }
        } else {
            System.out.println("item masih kosong");
        }
        System.out.println("----------------------------");
        System.out.println("Total harga : " + totalHarga);
    }

    public Barang[] getDaftarBarang() {
        return daftarBarang;
    }

    public void setDaftarBarang(Barang daftarBarang) {
        totalHarga += daftarBarang.harga;
        if (this.daftarBarang == null) {
            this.daftarBarang[0] = daftarBarang;
        } else {
            this.daftarBarang[this.daftarBarang.length] = daftarBarang;

        }
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
