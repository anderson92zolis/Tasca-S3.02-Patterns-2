package Nivell2CallBack;

public class CreditCard extends PaymentSystemMethod {

    private double price;
    private String brand;

    public CreditCard(double price,String brand) {
        super();
        this.price = price;
        this.brand = brand;
    }

    //getter

    public double getPrice() {
        return price;
    }



    public void executePayment() {

        System.out.println("starting the Payment System with: "+ toString());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Payment with a Credit Card done Successfully!" );
    }

    @Override
    public String toString() {
        return "CreditCard {" +
                "price= " + price +
                ", marca= '" + brand + '\'' +
                '}';
    }
}
