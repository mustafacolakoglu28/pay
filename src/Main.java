
public class Main {
    public static void main(String[] args) {

    PaymentManager[] selectedPayments = {new Qr(), new CreditCard(), new Transfer()};
    Payments payments = new Payments(selectedPayments);
    payments.create();
    payments.update();





    }
}