package Nivell2CallBack;

public abstract class PaymentSystemMethod {
    private PaymentSystemCallBack psCb;

    public PaymentSystemMethod() {
        this.psCb = psCb;
    }

    public abstract void executePayment();

}
