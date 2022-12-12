public class CreditCard implements PaymentManager{



    @Override
    public void add() {
        System.out.println("CreditCard metodu ile odeme gecildi");

    }

    @Override
    public void update() {
        System.out.println("CreditCard islemi guncellendi");


    }
}
