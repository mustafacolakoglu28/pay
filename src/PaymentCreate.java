public class PaymentCreate {
    private PaymentManager[] payments;
    PaymentCreate(PaymentManager[] payments){
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
