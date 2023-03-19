package Nivell3DependencyInjection;

import java.util.List;
import java.util.Map;

public class ExchangeRateCalculatorShop {


    private InterfaceExchangeRateServices converter;

    public ExchangeRateCalculatorShop(InterfaceExchangeRateServices converter) {
        this.converter = converter;
    }

    public double convertCurrency(double amount, String fromCurrency, String toCurrency) {

        Map<String, Double> exchangeRates = converter.getExchangeRates();
        double rate = exchangeRates.get(toCurrency) / exchangeRates.get(fromCurrency);
        return amount * rate;
    }
}
