package Nivell3DependencyInjection;

import java.util.Map;

public class WebExchangeRateService implements InterfaceExchangeRateServices {

    public WebExchangeRateService() {
    }

    public Map<String, Double> getExchangeRates() {
        Map<String, Double> exchangeRates = Map.of(
                "USD", 1.0,
                "EUR", 0.82,
                "GBP", 0.72
        );

        return exchangeRates;
    }
}