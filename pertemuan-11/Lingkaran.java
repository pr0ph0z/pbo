public class Lingkaran {
    double luasLingkaran;

    void hitungluas(double r) {
        double pi = 3.141592;
        this.luasLingkaran = pi * r * r;
    }

    void info() {
        System.out.println("
            Luas lingkaran: " + this.luasLingkaran);
    }
}