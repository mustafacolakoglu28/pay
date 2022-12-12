import java.nio.file.FileSystemNotFoundException;

public class Main {
    public static void main(String[] args) {

      //creating Qr transaction
      PaymentCreator qr = new QrCreate();

      Qr payWithQr = (Qr) qr.create();
      Qr payWithQr2 = (Qr) qr.create();

      payWithQr.Add();
      payWithQr.Update();

      payWithQr2.Add();
      payWithQr2.Update();





      // creating credit card transaction
      PaymentCreator creditCard = new CreditCardCreate();
      CreditCard payWithCreditCard = (CreditCard) creditCard.create();


      payWithCreditCard.Add();
      payWithCreditCard.Update();


      //creating transfer transaction
      PaymentCreator transfer = new TransferCreate();
      Transfer payWithTransfer = (Transfer) transfer.create();

      payWithTransfer.Add();
      payWithTransfer.Update();




    }
}