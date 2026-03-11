public class KamarStandar extends Kamar {

    public KamarStandar(String kodeKamar, double hargaPerMalam) {
        super(kodeKamar, "Standar", hargaPerMalam);
    }

    @Override
    public double hitungBiaya(int jumlahMalam) {
        return hargaPerMalam * jumlahMalam;
    }
}
