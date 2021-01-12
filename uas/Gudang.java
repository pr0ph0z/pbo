import java.util.List;
import java.util.ArrayList;

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
}