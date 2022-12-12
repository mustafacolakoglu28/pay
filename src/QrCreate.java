public class QrCreate implements PaymentCreator{


    @Override
    public Qr create() {
        return new Qr();
    }
}
