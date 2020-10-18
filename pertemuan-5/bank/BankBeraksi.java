package bank;

public class BankBeraksi {    
    public static void main(String[] args) {
        System.out.println("Selamat Datang di Bank ABC");
        Bank bank = new Bank(100000);
        bank.simpanUang(500000);
        bank.ambilUang(150000);
    }
}