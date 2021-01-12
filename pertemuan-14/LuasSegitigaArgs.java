public class LuasSegitigaArgs {
	public static void main(String[] args) {
          
		double alas= Double.parseDouble(args[0]);
		double tinggi = Double.parseDouble(args[1]);

		double luas = (alas*tinggi)/2;

		System.out.println("Luas Segitiga : " + luas);
	}
}
