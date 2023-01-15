public class Karyawan {
    private int gaji;
    private String nama;

    Karyawan(int iGaji,String sNama){
        gaji = iGaji;
        nama = sNama;
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
