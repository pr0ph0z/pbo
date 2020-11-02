public class ModifierStatic {
  // Method static
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Method public
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Method utama
  public static void main(String[ ] args) {
    myStaticMethod(); // Memanggil method static
    // myPublicMethod(); Jika memanggil ini akan muncul error

    ModifierStatic myObj = new ModifierStatic(); // Membuat object dari kelas ModifierStatic
    myObj.myPublicMethod(); // Memanggil method public
  }
}
