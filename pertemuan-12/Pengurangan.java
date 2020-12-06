public class Pengurangan {
    public static void main(String[] args) {
        int x, y, z;
        x = 42;
        y = x--;
        System.out.println("x = " + x + ", y = " + y);
        z = --x;
        System.out.println("x = " + x + ", z = " + z);
    }
}