import java.util.Scanner;

public class Main {
    static boolean exit = false;
    static Gudang gudang = new Gudang();

    public static void main(String[] args) {
        System.out.println("Selamat datang di Inventory Gudang");
        while (!exit) {
            printMenu();
            Scanner input = new Scanner(System.in);
            System.out.print("Pilih menu = ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    gudang.show();
                    System.out.print("\n");
                    break;
                case 2:
                    insertData();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia!");
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Menu: ");
        System.out.println("1. Lihat");
        System.out.println("2. Tambah");
        System.out.println("3. Ambil");
        System.out.println("4. Daftar Baru");
        System.out.println("5. ...");
        System.out.println("6. Keluar\n");
    }

    public static void insertData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih tipe: ");
        System.out.println("1. Handphone");
        System.out.println("2. Laptop");
        System.out.print("Pilih menu = ");
        int pilihan = input.nextInt();
        Scanner inputNama = new Scanner(System.in);
        System.out.print("Nama barang: ");
        String namaBarang = inputNama.nextLine();
        Scanner inputStok = new Scanner(System.in);
        System.out.print("Stok barang: ");
        int stokBarang = inputStok.nextInt();
        switch (pilihan) {
            case 1:
                Handphone handphone = new Handphone(namaBarang, stokBarang);
                handphone.setNama(namaBarang);
                handphone.setStok(stokBarang);
                gudang.add(handphone);
                System.out.println("Sukses menambah barang\n");
                break;
            case 2:
                Laptop laptop = new Laptop(namaBarang, stokBarang);
                laptop.setNama(namaBarang);
                laptop.setStok(stokBarang);
                gudang.add(laptop);
                System.out.println("Sukses menambah barang\n");
                break;
            default:
                System.out.println("Pilihan tidak tersedia!");
                exit = true;
                break;
        }
    }
}