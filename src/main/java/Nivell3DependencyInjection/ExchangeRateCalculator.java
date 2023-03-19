package Nivell3DependencyInjection;

import java.util.Map;

public class ExchangeRateCalculator {

    WebExchangeRateService webExchangeRateService;


    public ExchangeRateCalculator(WebExchangeRateService webExchangeRateService) {
        this.webExchangeRateService = webExchangeRateService;
    }

    public double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        Map<String, Double> exchangeRates = webExchangeRateService.getExchangeRates();
        double rate = exchangeRates.get(toCurrency) / exchangeRates.get(fromCurrency);
        return amount * rate;
    }
}
