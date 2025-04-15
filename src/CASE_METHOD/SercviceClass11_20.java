package CASE_METHOD;

import java.util.Scanner;

public class SercviceClass11_20 {
    TransaksiPembelian11_20[] trs;
    int index;

    void tambahDataTransaksi(TransaksiPembelian11_20[] Transaksi) {
        Scanner sc = new Scanner(System.in);
        trs = new TransaksiPembelian11_20[4];

        System.out.println("Masukkan kode transaksi yang ingin anda cari");
        System.out.print("Kode: ");
        String kodeCari = sc.nextLine();

        System.out.println("Kode transaksi berada di");
        int posisiKode = pencarianDataSequential(kodeCari);

        tampilPosisi("Kode cari :" + kodeCari, posisiKode);
        tampilDataSearch(posisiKode);
    }

    int pencarianDataSequential(String kodeCari) {
        int posisi = -1;
        for (int i = 0; i < trs.length; i++) {
            if (trs[i] != null && trs[i].kodeTransaksi.equalsIgnoreCase(kodeCari)) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(String n, int posi) {
        if (posi != -1) {
            System.out.println("Data Kode Transaksi dengan " + n + " ditemukan pada index ke-" + posi);
        } else {
            System.out.println("Data " + n + " tidak temukan");
        }
    }

    void tampilDataSearch(int posi) {
        if (posi != -1) {
            for (TransaksiPembelian11_20 m : trs) {
                m.tampilDataTransaksi();
                System.out.println("------------------------------------------------");
            }
        } else {
            System.out.println("Data Tidak ditemukan");
        }
    }
    // UpdateData(){

    // }

    // Sorting(){

    // }

}
