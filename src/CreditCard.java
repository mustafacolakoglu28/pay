public class CreditCard implements PaymentManager{

    @Override
    public void Add() {
        System.out.println("CreditCard metodu ile odeme gecildi");

    }

    @Override
    public void Update() {
        System.out.println("CreditCard islemi guncellendi");


    }
}
