public class ModifierFinal {
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    ModifierFinal myObj = new ModifierFinal();
    myObj.x = 50; //akan error karena tidak bisa mengubah variabel dengan keyword final
    myObj.PI = 25; //akan error karena tidak bisa mengubah variabel dengan keyword final
    System.out.println(myObj.x);
  }
}
