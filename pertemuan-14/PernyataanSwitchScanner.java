import java.util.Scanner;

public class PernyataanSwitchScanner {
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1. Soto ayam\n2. Gule kambing\n3. Nasi goreng");
        System.out.print("Pilih menu apa? ");
        int pilihan = input.nextInt();

		switch(pilihan){
		      case 1:
			System.out.println("Soto Ayam");
			break;
		      case 2:
			System.out.println("Gule Kambing");
			break;
		      case 3:
			System.out.println("Nasi Goreng");
			break;
		      default:
			System.out.println("Silakan Pilih 1, 2 atau 3");
		}
	}
}