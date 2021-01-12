import java.util.Scanner;

public class PernyataanIFELSEScanner {
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Diskon = ");
        int diskon = input.nextInt();
        System.out.print("Masukkan Total Belanja = ");
        int totalBelanja = input.nextInt();

		if(totalBelanja >= 100000){
		     diskon = totalBelanja/10;
		} else{
		     diskon = 0;
		}
		System.out.println("Diskon = " + diskon);
	}
}
