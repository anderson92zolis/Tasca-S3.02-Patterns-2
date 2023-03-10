package Nivell2CallBack;

public class PaymentSystemGateway implements PaymentSystemCallBack{

    PaymentSystemMethod method1;

    public PaymentSystemGateway(PaymentSystemMethod method1) {
        this.method1 = method1;
    }

    @Override
    public void paymentDoneSuccessfull() {
    System.out.println("Thanks you for choose the Payment System " );

    }
    public void callexecutePayment(){
        try {
            method1.executePayment();
            paymentDoneSuccessfull();

        } catch (Exception e){
            System.out.println("Payment System went wrong.");
        }
    }

}
