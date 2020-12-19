public class LuasSegitigaArgs {
	public static void main(String[] args) {
          
	    if (args.length == 2){
		double alas  = Double.parseDouble(args[0]);
		double tinggi = Double.parseDouble(args[1]);
		double luas = (alas*tinggi)/2;
		System.out.println("Luas Segitiga : " + luas);
	    } else {
		 System.out.println("Penggunaan Argument Salah!");
		 System.out.println("Contoh: java LuasSegitigaArgs 30 20");
	   }
	}
}
