import java.util.Scanner;

public class PernyataanIFELSEIFScanner{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan skor ujian = ");
        int skorUjian = input.nextInt();
		char nilai;
		if (skorUjian >= 90) {
		     nilai = 'A';
		} else if (skorUjian >= 80) {
		      nilai = 'B';
		} else if (skorUjian >= 70) {
		     nilai = 'C';
		} else {
		     nilai = 'D';
		}
		System.out.println("Nilai untuk skor ujian " + skorUjian + " adalah " + nilai);
	}
}