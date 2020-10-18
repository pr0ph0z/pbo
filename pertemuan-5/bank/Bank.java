package bank;

public class Bank {
    private int saldo = 0;
    
    public Bank(int saldo) {
        this.saldo = saldo;
        this.getUang();
    }

    public void simpanUang(int uang) {
        this.saldo += uang;
        System.out.println("\nSimpan uang: Rp. "+ this.saldo);
        this.getUang();
    }

    public void ambilUang(int uang) {
        this.saldo -= uang;
        System.out.println("\nAmbil uang: Rp. "+ this.saldo);
        this.getUang();
    }

    public void getUang(){
        System.out.println("Saldo saat ini: Rp. "+ this.saldo);
    }
}