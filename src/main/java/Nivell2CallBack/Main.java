package Nivell2CallBack;

public class Main {
    public static void main (String[] args ){

        PaymentSystemGateway psCreditC= new PaymentSystemGateway(new CreditCard(140, "Adidas 4X4"));
        psCreditC.callexecutePayment();

        PaymentSystemGateway psPayPall= new PaymentSystemGateway(new PayPal(150, "Nike Ultra light"));
        psPayPall.callexecutePayment();

        PaymentSystemGateway psBankAccountDebit= new PaymentSystemGateway(new BankAccountDebit(160, "Puma Mountain flex"));
        psBankAccountDebit.callexecutePayment();
    }
}
