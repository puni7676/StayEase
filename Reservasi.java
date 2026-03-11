public class Reservasi {

    private Tamu tamu;
    private Kamar kamar;
    private int jumlahMalam;
    private double totalBiaya;

    public Reservasi(Tamu tamu, Kamar kamar, int jumlahMalam)
            throws DataReservasiTidakValidException {

        if (kamar.hargaPerMalam <= 0)
            throw new DataReservasiTidakValidException("Harga kamar tidak valid");

        if (jumlahMalam <= 0)
            throw new DataReservasiTidakValidException("Jumlah malam harus > 0");

        if (!kamar.kodeKamar.startsWith("KM"))
            throw new DataReservasiTidakValidException("Kode kamar harus diawali KM");

        if (tamu.getNomorIdentitas().isEmpty())
            throw new DataReservasiTidakValidException("Nomor identitas kosong");

        this.tamu = tamu;
        this.kamar = kamar;
        this.jumlahMalam = jumlahMalam;
        this.totalBiaya = kamar.hitungBiaya(jumlahMalam);
    }

    public void tampilkanData() {

        System.out.println("Nama Tamu: " + tamu.getNama());
        System.out.println("Tipe Kamar: " + kamar.getTipeKamar());
        System.out.println("Jumlah Malam: " + jumlahMalam);
        System.out.println("Total Biaya: " + totalBiaya);

        if (kamar instanceof FreeBreakfast) {
            ((FreeBreakfast) kamar).tampilkanFasilitasSarapan();
        }

        System.out.println("----------------------");
    }
}