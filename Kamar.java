public abstract class Kamar {

    protected String kodeKamar;
    protected String tipeKamar;
    protected double hargaPerMalam;

    public Kamar(String kodeKamar, String tipeKamar, double hargaPerMalam) {
        this.kodeKamar = kodeKamar;
        this.tipeKamar = tipeKamar;
        this.hargaPerMalam = hargaPerMalam;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public abstract double hitungBiaya(int jumlahMalam);
}