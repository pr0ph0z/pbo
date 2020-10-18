package hp;

public class HandphoneBeraksi {
    public static void main (String[] args) {
        Handphone hp = new Handphone();
        hp.hidupkan();
        hp.lakukanPanggilan();
        hp.kirimSMS();
        hp.matikan();
    }
}