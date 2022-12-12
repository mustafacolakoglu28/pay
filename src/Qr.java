public class Qr implements PaymentManager {

    @Override
    public void add() {

        System.out.println("Qr metodu ile odeme gecildi.");
    }

    @Override
    public void update() {
        System.out.println("Qr islemi guncellendi");
    }


}
