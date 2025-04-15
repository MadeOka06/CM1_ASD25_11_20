package CASE_METHOD;

import java.util.Scanner;

public class MainSistem {
    Barang11_20[] barang;

    public static void main(String[] args) {
        Barang11_20 list = new Barang11_20();
        TransaksiPembelian11_20 tr = new TransaksiPembelian11_20();
        SercviceClass11_20 src = new SercviceClass11_20();
        Scanner sc = new Scanner(System.in);
        Barang11_20[] barang = {
                new Barang11_20("Br001", "Leo Kripik", "Makanan", 10, 1000),
                new Barang11_20("Br002", "You C1000 Botol", "Minuman", 10, 7000),
                new Barang11_20("Br003", "Teh Pucuk Botol", "Makanan", 10, 4000),
                new Barang11_20("Br004", "Rinso Cair", "Makanan", 10, 7000),
                new Barang11_20("Br005", "Mama Lemon Cair", "Makanan", 10, 1000),
        };
        TransaksiPembelian11_20[] Transaksi = {
                new TransaksiPembelian11_20("Tr001", "Santi", "21-04-2024", "Leo Kripik", 1, 1000),
                new TransaksiPembelian11_20("Tr002", "Vani", "21-04-2024", "You C1000 Botol", 2, 7000),
                new TransaksiPembelian11_20("Tr003", "Siska", "21-04-2024", "Teh Pucuk Botol", 3, 4000),
                new TransaksiPembelian11_20("Tr004", "MeiMei", "21-04-2024", "Teh Pucuk Botol", 1, 4000),
                new TransaksiPembelian11_20("Tr005", "Ihsan", "21-04-2024", "You C1000 Botol", 1, 7000),
        };
        while (true) {
            System.out.println("============== TOKO Manasuka =============");
            System.out.println("1. Data Barang");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Pencarian Data");
            System.out.println("4. Pengurutan Data");
            System.out.println("5. Tampilkan Kode Terbalik");
            System.out.println("6. Exit");
            System.out.print("Chose Menu ( 1-6 ) : ");
            int menu = sc.nextInt();

            if (menu == 1) {
                list.tampilDataBarang();
                for (Barang11_20 b : barang) {
                    System.out.printf("| %-11s | %-15s | %-11s | %-5d | %-5d |\n", b.kodeBarang, b.nama, b.kategori,
                            b.stock,
                            b.harga);
                }
                System.out.println("===============================================================");
            } else if (menu == 2) {
                tr.tampilDataTransaksi();
                for (TransaksiPembelian11_20 r : Transaksi) {
                    System.out.printf("| %-14s | %-16s | %-20s |%-15s| %-9d | %-5d |\n", r.kodeTransaksi,
                            r.namaPembelian, r.tanggalPembelian, r.brg, r.qty, r.hrg);
                }
            } else if (menu == 3) {
                src.tambahDataTransaksi(Transaksi);
            } else if (menu == 4) {

            } else if (menu == 5) {

            } else if (menu == 6) {
                break;
            }
        }

    }
}
