package Nivell3DependencyInjection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Products product1= new Products("laptop",1100);
        Products product2= new Products("Speaker",440);
        Products product3= new Products("mouse",45);

        List<Products> productsList = new ArrayList<>();

        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);

        ExchangeRateCalculatorShop currentExchange = new ExchangeRateCalculatorShop(new WebExchangeRateService());

        {System.out.println(currentExchange.convertCurrency(200, "USD","EUR"));}

        for(int i=0, ){;}


        /*productsList.forEach(
                x->System.out.println("Product : "+x.getName()+ " cost USD "+ x.getPrice() +
                "\n"+ " The result in EUR is: "+ currentExchange.convertCurrency(x.getPrice(), "USD","EUR")+
                "\n"+ " The result in GPT is: "+currentExchange.convertCurrency(x.getPrice(), "USD","GPT")
                )
        );*/
    }


}