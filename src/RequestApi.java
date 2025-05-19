import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequestApi {

    public double obterTaxaCambio(String moedaOrigem, String moedaDestino) throws Exception {
       
        String apiKey = "a73080a532c40056e5df6e46";

    
        String urlStr = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + moedaOrigem;

        URL url = new URL(urlStr);
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("GET"); 

    
        BufferedReader reader = new BufferedReader(new InputStreamReader(conexao.getInputStream()));

        JsonObject json = JsonParser.parseReader(reader).getAsJsonObject();
        reader.close(); 

      
        JsonObject rates = json.getAsJsonObject("conversion_rates");

        
        return rates.get(moedaDestino).getAsDouble();
    }
}
