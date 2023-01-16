public class Barang {
    private String nama,namaBahan,detailHargaBahan ;
    private int harga,hargaModal,id;
    Barang(int iId,String sNama,int iHarga,String sNamaBahan,String sDetailHargaBahan,int iHargaModal){
        this.setHarga(iHarga);
        this.setNama(sNama);
        this.setDetailHargaBahan(sDetailHargaBahan);
        this.setHargaModal(iHargaModal);
        this.setNamaBahan(sNamaBahan);
        this.setId(iId);
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setHargaModal(int hargaModal) {
        this.hargaModal = hargaModal;
    }
    public int getHargaModal() {
        return hargaModal;
    }
    public void setNamaBahan(String namaBahan) {
        this.namaBahan = namaBahan;
    }
    public String getNamaBahan() {
        return namaBahan;
    }
    public void setDetailHargaBahan(String detailHargaBahan) {
        this.detailHargaBahan = detailHargaBahan;
    }
    public String getDetailHargaBahan() {
        return detailHargaBahan;
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
