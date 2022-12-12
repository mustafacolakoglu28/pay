
public class Transfer implements PaymentManager{

    @Override
    public void add() {
        System.out.println("Transfer metodu ile odeme gecildi");
    }

    @Override
    public void update() {
        System.out.println("Transfer islemi guncellendi");

    }
}
