public class CreditCardCreate implements PaymentCreator {
    @Override
    public CreditCard create() {
        return new CreditCard();
    }
}
