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
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.kategori = kategori;
        this.stock = stock;
        this.harga = harga;
    }

    void tampilDataBarang() {
        System.out.println("===============================================================");
        System.out.println("| Kode Barang | Nama Barang     | Kategori    | Stock | Harga |");
        System.out.println("===============================================================");

    }

}
