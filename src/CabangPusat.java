public class CabangPusat extends Perusahaan {
        private String KodeCabang,Lokasi;
        
        CabangPusat(){
            this.KodeCabang = "cb-pusat";
            Lokasi = "tangerang,banten";
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
