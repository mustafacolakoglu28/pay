public class Payments {
    private PaymentManager[] payments;
    Payments(PaymentManager[] payments){
        this.payments= payments;
    }
    public void create(){
        for (PaymentManager payment: payments){
            payment.add();
        }

    }
    public void update(){
        for (PaymentManager payment: payments){
            payment.update();
        }
    }

}
