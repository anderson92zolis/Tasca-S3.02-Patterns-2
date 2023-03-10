package Nivell2CallBack;

public class PayPal extends PaymentSystemMethod{

    private double price;
    private String marca;

    public PayPal(double price ,String marca) {
        super();
        this.price = price;
        this.marca = marca;
    }

    //getter

    public double getPrice() {
        return price;
    }



    public void executePayment() {

        System.out.println("starting the Payment System of: "+ toString());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Payment with a PayPall done Successfully!" );
    }


    @Override
    public String toString() {
        return "PayPal {" +
                "price=" + price +
                ", marca='" + marca + '\'' +
                '}';
    }
}