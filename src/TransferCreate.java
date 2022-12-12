public class TransferCreate implements PaymentCreator{
    @Override
    public Transfer create() {
        return new Transfer();
    }
}
