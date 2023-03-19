package Nivell3DependencyInjection;

public class Main {
    public static void main(String[] args) {

        ExchangeRateCalculator dollarExchange = new ExchangeRateCalculator(new WebExchangeRateService());
        double amount = 100;
        String fromCurrency= "USD";
        String toCurrency= "EUR";

        double  resultEURExchange= dollarExchange.convertCurrency(amount,fromCurrency,toCurrency);
        System.out.println("The result in dollars EUR is: " + resultEURExchange );

        double resultGBPExchange= dollarExchange.convertCurrency(amount,fromCurrency,toCurrency);
        System.out.println("The result in dollars GBP is: " + resultGBPExchange );

    }
}