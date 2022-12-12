public class Qr implements PaymentManager {

    @Override
    public void Add() {

        System.out.println("Qr metodu ile odeme gecildi.");
    }

    @Override
    public void Update() {
        System.out.println("Qr islemi guncellendi");
    }


}
