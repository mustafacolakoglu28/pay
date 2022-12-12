
public class Transfer implements PaymentManager{

    @Override
    public void Add() {
        System.out.println("Transfer metodu ile odeme gecildi");
    }

    @Override
    public void Update() {
        System.out.println("Transfer islemi guncellendi");

    }
}
