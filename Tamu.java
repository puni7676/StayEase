public class Tamu {

    private String idTamu;
    private String nama;
    private String nomorIdentitas;

    public Tamu(String idTamu, String nama, String nomorIdentitas) {
        this.idTamu = idTamu;
        this.nama = nama;
        this.nomorIdentitas = nomorIdentitas;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorIdentitas() {
        return nomorIdentitas;
    }
}