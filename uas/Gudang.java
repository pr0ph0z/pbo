import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Gudang {
    public List<Barang> listBarang = new ArrayList<Barang>();

    public void show() {
        System.out.println("\nDaftar Barang:");
        for (int i = 0; i < listBarang.size(); i++) {
            System.out.println("==================");
            listBarang.get(i).detail();
        }
    }
    
    public void add(Barang barang) {
        this.listBarang.add(barang);
    }

    public void UpdateBarang(String nama, int stok) {
        for (int i = 0; i < listBarang.size(); i++) {
            String nbarang = listBarang.get(i).getNama();

            if (nbarang.equals(nama)) {
            int stokLama = listBarang.get(i).getStok() ;
              int stokBaru = stokLama - stok;
            listBarang.get(i).setStok(stokBaru);
            }
        }
}
    public void TambahStok(String nama, int stok) {
        for (int i = 0; i < listBarang.size(); i++) {
            String nbarang = listBarang.get(i).getNama();

            if (nbarang.equals(nama)) {
            int stokLama = listBarang.get(i).getStok() ;
              int stokBaru = stokLama + stok;
            listBarang.get(i).setStok(stokBaru);
            }
    }
 } 
    public void RemoveBarang(String nama){

        for (int i = 0; i < listBarang.size(); i++) {
            String nbarang = listBarang.get(i).getNama();

            if (nbarang.equals(nama)) {
                listBarang.remove(listBarang.get(i));
            }
        }
    }
}