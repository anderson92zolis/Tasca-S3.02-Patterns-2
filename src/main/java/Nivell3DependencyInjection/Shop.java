package Nivell3DependencyInjection;

import java.awt.*;

public class Shop {

    private List<Products> listProducts;
    private ExchangeRateServices converter;

    public Shop( List<Products> listProducts, ExchangeRateServices converter) {
        this.listProducts = listProducts;
        this.converter = converter;
    }

    public void showPrices() {
        listProducts.forEach(p -> {
            double priceConverted = converter.getExchangeRates(p);
            System.out.println("Product" + p.getName() + " with price" + priceConverted + ".");
        });
    }
}
