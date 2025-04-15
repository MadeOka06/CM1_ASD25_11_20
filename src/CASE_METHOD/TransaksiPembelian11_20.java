package CASE_METHOD;

import java.util.Scanner;

public class TransaksiPembelian11_20 {
    String kodeTransaksi;
    String namaPembelian;
    String tanggalPembelian;
    int qty;
    Barang11_20[] barang;

    TransaksiPembelian11_20(String kodeTransaksi, String namaPembelian, String tanggalPembelian, int qty, String brg) {
        this.kodeTransaksi = kodeTransaksi;
        this.namaPembelian = namaPembelian;
        this.tanggalPembelian = tanggalPembelian;
        this.qty = qty;
        String barang = brg;
    }

    void tampilDataTransaksi() {
        for (Barang11_20 m : barang) {
            m.tampilDataBarang();
        }
    }

}