
public class Main {
    public static void main(String[] args) {

    PaymentManager[] selectedPayments = {new Qr(), new CreditCard(), new Transfer()};
    PaymentCreate paymentCreate = new PaymentCreate(selectedPayments);
    paymentCreate.create();
    paymentCreate.update();




    }
}