import java.util.Scanner;

public class MainStayEase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Reservasi[] data = new Reservasi[75];
        int jumlah = 0;

        while (true) {

            System.out.println("1. Tambah Reservasi");
            System.out.println("2. Keluar");
            System.out.print("Pilih: ");
            int pilih = input.nextInt();
            input.nextLine();

            if (pilih == 2) break;

            try {

                System.out.print("ID Tamu: ");
                String id = input.nextLine();

                System.out.print("Nama: ");
                String nama = input.nextLine();

                System.out.print("Nomor Identitas: ");
                String nik = input.nextLine();

                Tamu tamu = new Tamu(id, nama, nik);

                System.out.print("Kode kamar: ");
                String kode = input.nextLine();

                System.out.print("Harga per malam: ");
                double harga = input.nextDouble();

                System.out.print("Jumlah malam: ");
                int malam = input.nextInt();

                System.out.print("Tipe kamar (1 Standar / 2 Deluxe): ");
                int tipe = input.nextInt();
                input.nextLine();

                Kamar kamar;

                if (tipe == 1)
                    kamar = new KamarStandar(kode, harga);
                else
                    kamar = new KamarDeluxe(kode, harga);

                Reservasi r = new Reservasi(tamu, kamar, malam);

                data[jumlah++] = r;

                System.out.println("Reservasi berhasil!");

            } catch (DataReservasiTidakValidException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("\nREKAP DATA");

        for (int i = 0; i < jumlah; i++) {
            data[i].tampilkanData();
        }
    }
}