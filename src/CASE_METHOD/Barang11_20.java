package CASE_METHOD;

public class Barang11_20 {
    String kodeBarang;
    String nama;
    String kategori;
    int stock;
    int harga;

    Barang11_20() {

    }

    Barang11_20(String kodeBarang, String nama, String kategori, int stock, int harga) {
        kodeBarang = kodeBarang;
        nama = nama;
        kategori = kategori;
        stock = stock;
        harga = harga;
    }

    void tampilDataBarang() {
        System.out.println("==========================================");
        System.out.println("| Kode Barang | Nama Barang | Stock | Harga |");
        System.out.println("==========================================");
        System.out.printf("| %-11s | %-11s | %-5d | %-5d |\n", kodeBarang, nama, stock, harga);
        System.out.println("==========================================");
    }

}
