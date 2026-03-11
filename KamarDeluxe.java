public class KamarDeluxe extends Kamar implements FreeBreakfast {

    public KamarDeluxe(String kodeKamar, double hargaPerMalam) {
        super(kodeKamar, "Deluxe", hargaPerMalam);
    }

    @Override
    public double hitungBiaya(int jumlahMalam) {
        return (hargaPerMalam * jumlahMalam) + 300000;
    }

    @Override
    public void tampilkanFasilitasSarapan() {
        System.out.println("Gratis Sarapan untuk 2 Orang");
    }
}