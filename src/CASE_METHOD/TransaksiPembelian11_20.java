package CASE_METHOD;

import java.util.Scanner;

public class TransaksiPembelian11_20 {
    String kodeTransaksi;
    String namaPembelian;
    String tanggalPembelian;
    int qty;
    String barang;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Barang11_20[] barang = {
                new Barang11_20("Br001", "Leo Kripik", "Makanan", 10, 1000),
                new Barang11_20("Br002", "You C1000 Botol", "Minuman", 10, 7000),
                new Barang11_20("Br003", "Teh Pucuk Botol", "Makanan", 10, 4000),
                new Barang11_20("Br004", "Rinso Cair", "Makanan", 10, 7000),
                new Barang11_20("Br005", "Mama Lemon Cair", "Makanan", 10, 1000),
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

            } else if (menu == 2) {

            } else if (menu == 3) {

            } else if (menu == 4) {

            } else if (menu == 5) {

            } else if (menu == 6) {
                break;
            }    
        }
        
    }
    TransaksiPembelian11_20 (String kodeTransaksi,  String namaPembelian ,String tanggalPembelian , int qty, String brg){
        this.kodeTransaksi = kodeTransaksi;
        this.namaPembelian = namaPembelian;
        this.tanggalPembelian = tanggalPembelian;
        this.qty = qty;
        barang = brg;
    }

}