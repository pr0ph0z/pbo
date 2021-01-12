public class Barang extends Inventory {
    private String nama;
    private int stok;

    public Barang(String nama, int stok) {
        this.nama = nama;
        this.stok = stok;
    }

    public Barang(String nama) {
        this.nama = nama;
        this.stok = 1;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setStok(int stok){
        this.stok = stok;
    }

    public int getStok() {
        return this.stok;
    }

    public void detail() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Stok: " + this.stok);
    }
}