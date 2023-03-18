package Nivell3DependencyInjection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class WebExchangeRateService implements ExchangeRateServices {

    public Map<String, Double> getExchangeRates() {
        Map<String, Double> exchangeRates = new HashMap<>();

        try {
            // Conectar con el servicio web
            URL url = new URL("http://api.exchangeratesapi.io/v1/latest?access_key=<your-access-key>");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Leer la respuesta del servicio web
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Analizar la respuesta y obtener las tasas de cambio
            String responseBody = response.toString();
            JSONObject json = new JSONObject(responseBody);
            JSONObject rates = json.getJSONObject("rates");

            exchangeRates.put("EUR", rates.getDouble("EUR"));
            exchangeRates.put("USD", rates.getDouble("USD"));
            exchangeRates.put("GBP", rates.getDouble("GBP"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return exchangeRates;
    }
}