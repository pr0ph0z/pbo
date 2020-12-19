import java.util.Scanner;

public class LuasSegitiga {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Masukkan ALas = ");
        double alas = input.nextDouble();
        
        System.out.print("Masukkan Tinggi = ");
		double tinggi = input.nextDouble();

		double luas = (alas*tinggi)/2;
		System.out.println("Jadi, Luas Segitiga adalah = " + luas);
	}
}

