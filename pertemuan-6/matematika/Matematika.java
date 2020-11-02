package matematika;

public class Matematika {
    public void pertambahan (int a, int b) {
        System.out.println("Pertambahan: "+ a +" + "+ b +" = "+ (a + b));
    }

    public void pertambahan (float a, float b, float c) {
        System.out.println("Pertambahan: "+ a +" + "+ b +" + "+ c +" = "+ String.valueOf(a + b + c));
    }

    public void pengurangan (int a, int b) {
        System.out.println("Pengurangan: "+ a +" - "+ b +" = "+ (a - b));
    }

    public void pengurangan (float a, float b, float c) {
        System.out.println("Pengurangan: "+ a +" - "+ b +" - "+ c +" = "+ String.valueOf(a - b -c));
    }

    public void perkalian (int a, int b) {
        System.out.println("Perkalian: "+ a +" * "+ b +" = "+ (a * b));
    }

    public void perkalian (float a, float b, float c) {
        System.out.println("Perkalian: "+ a +" * "+ b +" * "+ c +" = "+ String.valueOf(a * b * c));
    }

    public void pembagian (int a, int b) {
        System.out.println("Pembagian: "+ a +" / "+ b +" = "+ ((int)a / b));
    }

    public void pembagian (int a, int b, float c) {
        System.out.println("Pembagian: "+ a +" / "+ b +" / "+ c +" = "+ String.valueOf(a / b /c));
    }
}