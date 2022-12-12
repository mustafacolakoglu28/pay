public class Main {
    public static void main(String[] args) {
        //CreditCard payWithCreditCard = new CreditCard();
        //Transfer payWithTransfer = new Transfer();
        Qr payWithQr = new Qr();

        payWithQr.Add();
        payWithQr.Update();
    }
}