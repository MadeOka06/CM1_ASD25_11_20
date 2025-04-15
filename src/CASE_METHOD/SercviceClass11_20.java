package CASE_METHOD;

import java.util.Scanner;

public class SercviceClass11_20 {
    TransaksiPembelian11_20[] trs;
    int index;

    SercviceClass11_20(TransaksiPembelian11_20[] trs, int index){
        this.trs = trs;
        this.index = index;
    }

    void tambahDataTransaksi(TransaksiPembelian11_20[] Transaksi) {
        Scanner sc = new Scanner(System.in);
        this.trs = Transaksi;

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
            TransaksiPembelian11_20 data = trs[posi];
            System.out.printf(" %-14s  %-16s  %-20s %-15s %-9d  %-5d \n",
                    data.kodeTransaksi, data.namaPembelian, data.tanggalPembelian,
                    data.brg, data.qty, data.hrg);
        } else {
            System.out.println("Data Tidak ditemukan");
        }
    }
    void bubbleSort() {
        if (trs == null) {
            System.out.println("Data transaksi belum diatur. Harap set terlebih dahulu.");
            return;
        }
        for (int i = 0; i < trs.length - 1; i++) {
            for (int j = 0; j < trs.length - 1 - i; j++) {
                if (trs[j] != null && trs[j + 1] != null &&
                    trs[j].kodeTransaksi.compareToIgnoreCase(trs[j + 1].kodeTransaksi) > 0) {
    
                    TransaksiPembelian11_20 temp = trs[j];
                    trs[j] = trs[j + 1];
                    trs[j + 1] = temp;
                }
            }
        }
    }
        void tampilUrut() {
           bubbleSort();
            System.out.println("Data transaksi setelah diurutkan berdasarkan kode transaksi:");
            for (TransaksiPembelian11_20 data : trs) {
                if (data != null) {
                    System.out.printf(" %-14s  %-16s  %-20s %-15s %-9d  %-5d \n",
                            data.kodeTransaksi, data.namaPembelian, data.tanggalPembelian,
                            data.brg, data.qty, data.hrg);
                }
            }
        }
    }

