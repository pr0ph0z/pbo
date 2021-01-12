public class OperatorTernary{

    public static void main(String[] args){
       int totalBelanja = 500000;

       int diskon = totalBelanja >= 100000 ?totalBelanja/10 : 0;

      System.out.println("Diskon = " + diskon);
   }
}