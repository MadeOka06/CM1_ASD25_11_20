package CASE_METHOD;
public class TransaksiPembelian11_20 {
    Barang11_20[] barang;
    String kodeTransaksi;
    String namaPembelian;
    String tanggalPembelian;
    String brg;
    int qty;
    int hrg;

    TransaksiPembelian11_20(){

    }
    TransaksiPembelian11_20(String kodeTransaksi, String namaPembelian, String tanggalPembelian, String barang, int qty, int harga) {
        this.kodeTransaksi = kodeTransaksi;
        this.namaPembelian = namaPembelian;
        this.tanggalPembelian = tanggalPembelian;
        this.qty = qty;
        brg = barang;
        hrg = harga;
    }
    void tampilDataTransaksi() {
        System.out.println("===============================================================================================");
        System.out.println("| Kode Transaksi | Nama Pembeli     | Tanggal Pembelian    | Nama Barang   | Kuantitas | Harga | ");
        System.out.println("===============================================================================================");

    }
}