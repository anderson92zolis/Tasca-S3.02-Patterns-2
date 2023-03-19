package Nivell3DependencyInjection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Products product1= new Products("Laptop",1100);
        Products product2= new Products("Speaker",440);
        Products product3= new Products("Mouse",45);

        List<Products> productsList = new ArrayList<>();

        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);

        ExchangeRateCalculatorShop currentExchange = new ExchangeRateCalculatorShop(new WebExchangeRateService());

        // {System.out.println(currentExchange.convertCurrency(200, "USD","EUR")); }

        if(productsList.size()!= 0) {
            for (Products products : productsList) {
                System.out.print("The product " + products.getName() + " cost USD " + products.getPrice());
                System.out.print("\t"+currentExchange.convertCurrency(products.getPrice(), "USD", "EUR") + " EUR ");
                System.out.print("\t"+currentExchange.convertCurrency(products.getPrice(), "USD", "GBP") + " GBP "+ "\n");
            }
        }
    }

}